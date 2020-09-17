package com.greenfox.backendapitest.controllers;

import com.greenfox.backendapitest.models.Arrow;
import com.greenfox.backendapitest.models.ErrorMessage;
import com.greenfox.backendapitest.models.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

@RestController
public class GuardianController {

  @GetMapping ("/groot")
  public ResponseEntity addResponse(@RequestParam (required = false) String message) {
    if (message == null || message.length() == 0) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorMessage("I am Groot!"));
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new Response(message, "I am Groot!"));
    }
  }

  @GetMapping ("/yondu")
  public ResponseEntity addResponse(@RequestParam (required = false) Double distance, @RequestParam (required = false) Double time) {
    if (distance == null || time == null || time == 0) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorMessage("Bad request! Provide valid distance & time!"));
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new Arrow(distance, time));
    }
  }
}
