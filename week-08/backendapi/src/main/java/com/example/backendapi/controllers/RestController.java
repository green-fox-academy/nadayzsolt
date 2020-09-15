package com.example.backendapi.controllers;

import com.example.backendapi.models.ErrorMessage;
import com.example.backendapi.models.Input;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @GetMapping("/doubling")
  public ResponseEntity getDoubleResult(@RequestParam(required = false) Integer input) {
    if (input == null) {
      return ResponseEntity.status(HttpStatus.OK).body(new ErrorMessage("Please provide an input!"));
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new Input(input));
    }
  }
}
