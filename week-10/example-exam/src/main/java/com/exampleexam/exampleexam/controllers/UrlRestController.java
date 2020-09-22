package com.exampleexam.exampleexam.controllers;

import com.exampleexam.exampleexam.services.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlRestController {
  UrlService urlService;

  @Autowired
  public UrlRestController(UrlService urlService) {
    this.urlService = urlService;
  }

  @GetMapping("/api/links")
  public ResponseEntity responseListOfCargo() {
    return ResponseEntity.status(HttpStatus.OK).body(urlService.listAllUrls());
  }
// @DeleteMapping ("/api/links/{id}")
//  public ResponseEntity responseListOfCargo() {
//    return ResponseEntity.status(HttpStatus.OK).body(urlService.listAllUrls());
//  }
}
