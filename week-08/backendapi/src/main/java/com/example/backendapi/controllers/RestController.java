package com.example.backendapi.controllers;

import com.example.backendapi.models.Appended;
import com.example.backendapi.models.ArrayHandlerInput;
import com.example.backendapi.models.ErrorMessage;
import com.example.backendapi.models.Input;
import com.example.backendapi.models.InputSumFactor;
import com.example.backendapi.models.WelcomeMessage;
import com.example.backendapi.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {
  MainService mainService;

  @Autowired
  public RestController(MainService mainService) {
    this.mainService = mainService;
  }

  @GetMapping("/doubling")
  public ResponseEntity getDoubleResult(@RequestParam(required = false) Integer input) {
    if (input == null) {
      return ResponseEntity.status(HttpStatus.OK)
          .body(new ErrorMessage("Please provide an input!"));
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new Input(input));
    }
  }

  @GetMapping("/greeter")
  public ResponseEntity showGreetingsByName(@RequestParam(required = false) String name,
                                            @RequestParam(required = false) String title) {
    if (name == null && title == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new ErrorMessage("Please provide a name and a title!"));
    } else if (name == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new ErrorMessage("Please provide a name!"));
    } else if (title == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new ErrorMessage("Please provide a title!"));
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new WelcomeMessage(name, title));
    }
  }

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity appendAnALetterOnWord(@PathVariable(required = false) String appendable) {
    return ResponseEntity.status(HttpStatus.OK).body(new Appended(appendable));
  }

  @PostMapping("/dountil/{action}")
  public ResponseEntity doActionUntil(@PathVariable(required = false) String action,
                                      @RequestBody InputSumFactor inputSumFactor) {
    if (inputSumFactor == null) {
      return ResponseEntity.status(HttpStatus.OK)
          .body(new ErrorMessage("Please provide a number!"));
    } else {
      return ResponseEntity.status(HttpStatus.OK)
          .body(mainService.countSumOrFactor(action, inputSumFactor));
    }
  }

  @PostMapping("/arrays")
  public ResponseEntity handleArrays(@RequestBody ArrayHandlerInput arrayHandlerInput) {
    if (arrayHandlerInput == null) {
      return ResponseEntity.status(HttpStatus.OK)
          .body(new ErrorMessage("Please provide what to do with the numbers!"));
    } else if (arrayHandlerInput.getWhat().equals("sum") || arrayHandlerInput.getWhat().equals("multiply")) {
      return ResponseEntity.status(HttpStatus.OK)
          .body(mainService.countArrayHandler(arrayHandlerInput));
    } else if (arrayHandlerInput.getWhat().equals("double")) {
      return ResponseEntity.status(HttpStatus.OK)
          .body(mainService.countArrayHandlerWithArray(arrayHandlerInput));
    } else {throw new UnsupportedOperationException();}
  }
}
