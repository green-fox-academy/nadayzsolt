package com.example.backendapi.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ErrorMessage {
  private String error;

  public ErrorMessage(String error) {
    this.error = error;
  }
}