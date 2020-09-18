package com.greenfox.backendapitest.controllers;

import com.greenfox.backendapitest.models.Arrow;
import com.greenfox.backendapitest.models.Cargo;
import com.greenfox.backendapitest.models.ErrorMessage;
import com.greenfox.backendapitest.models.ReceivedCargo;
import com.greenfox.backendapitest.models.Response;
import com.greenfox.backendapitest.services.GuardianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {
  GuardianService guardianService;

  @Autowired
  public GuardianController(GuardianService guardianService) {
    this.guardianService = guardianService;
  }

  @GetMapping("/groot")
  public ResponseEntity addGrootResponse(@RequestParam(required = false) String message) {
    if (message == null || message.length() == 0) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorMessage("I am Groot!"));
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new Response(message, "I am Groot!"));
    }
  }

  @GetMapping("/yondu")
  public ResponseEntity addYonduResponse(@RequestParam(required = false) Double distance,
                                         @RequestParam(required = false) Double time) {
    if (distance == null || time == null || time == 0) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new ErrorMessage("Bad request! Provide valid distance & time!"));
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new Arrow(distance, time));
    }
  }

  @GetMapping("/rocket")
  public ResponseEntity responseListOfCargo() {
    Cargo cargo = guardianService.getCargo();
    return ResponseEntity.status(HttpStatus.OK).body(cargo);
  }

  @GetMapping("/rocket/fill")
  public ResponseEntity responseReceivedListOfCargo(@RequestParam(required = false) String caliber,
                                                    @RequestParam(required = false)
                                                        Integer amount) {
    Cargo cargo = guardianService.getCargo();
    ReceivedCargo receivedCargo = guardianService.getReceivedCargo();
    if (!caliber.equals(".30") && !caliber.equals(".25") && !caliber.equals(".50") || caliber == null || amount == null || amount < 0) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new ErrorMessage("Bad request! Provide valid caliber & amount!"));
    } else {
      guardianService.setDifferentCalAmounts(caliber, amount);
      guardianService.setCargoShipStatus();
      guardianService.setReceivedCargoShipStatus(caliber, amount);
      return ResponseEntity.status(HttpStatus.OK).body(receivedCargo);
    }
  }
}
