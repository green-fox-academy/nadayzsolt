package com.example.backendapi.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArrayHandlerWithArray {
  int [] result;
// ez lett volna, hogyha az eredeti megoldást viszem:
//  public void setResultElement (int value, int counter) {
//    this.result[counter] = value;
//  }
}
