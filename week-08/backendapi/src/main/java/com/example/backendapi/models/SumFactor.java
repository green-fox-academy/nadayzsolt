package com.example.backendapi.models;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class SumFactor {
  private int result;

  public SumFactor(int result) {
    this.result = result;
  }
}
