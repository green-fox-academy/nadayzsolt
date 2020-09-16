package com.example.backendapi.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Input {
 private int received;
 private int result;

  public Input(int received) {
    this.received = received;
    result = received * 2;
  }
}
