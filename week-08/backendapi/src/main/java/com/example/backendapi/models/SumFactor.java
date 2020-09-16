package com.example.backendapi.models;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SumFactor {
  private int result;

  public SumFactor(int result) {
    this.result = result;
  }
}
