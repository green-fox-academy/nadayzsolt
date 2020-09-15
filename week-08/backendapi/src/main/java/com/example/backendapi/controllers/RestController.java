package com.example.backendapi.controllers;

import com.example.backendapi.models.Appended;
import com.example.backendapi.models.ErrorMessage;
import com.example.backendapi.models.Input;
import com.example.backendapi.models.WelcomeMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

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
  public ResponseEntity showGreetingsByName(@PathVariable (required = false) String appendable) {
      return ResponseEntity.status(HttpStatus.OK).body(new Appended(appendable));
  }
}