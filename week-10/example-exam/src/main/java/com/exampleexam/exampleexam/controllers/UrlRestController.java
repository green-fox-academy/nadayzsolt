package com.exampleexam.exampleexam.controllers;

import com.exampleexam.exampleexam.models.InputCode;
import com.exampleexam.exampleexam.services.UrlService;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlRestController {
  UrlService urlService;

  @Autowired
  public UrlRestController(UrlService urlService) {
    this.urlService = urlService;
  }

  @GetMapping("/api/links")
  public ResponseEntity responseUrlList() {
    return ResponseEntity.status(HttpStatus.OK).body(urlService.listAllUrls());
  }

  @Transactional
  @DeleteMapping("/api/links/{id}")
  public ResponseEntity deleteUrlByCode(@PathVariable (required = false) int id,
                                        @RequestBody InputCode inputCode) {
    if (inputCode.getSecretCode() == null) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    } else if (urlService.checkCode(inputCode.getSecretCode()) != urlService.checkId(id)) {
      return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    } else {
      urlService.removeUrlByCode (inputCode.getSecretCode());
      return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
  }
}
