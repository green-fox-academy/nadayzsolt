package com.example.backendapi.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ArrayHandler {
  int result;

  public ArrayHandler(int result) {
    this.result = result;
  }
}
