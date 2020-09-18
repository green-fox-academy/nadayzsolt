package com.greenfox.backendapitest.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ReceivedCargo {
  private String received;
  private int amount;
  private String shipStatus;
  private boolean ready;

  public ReceivedCargo(String caliber, int amount) {
    this.received = caliber;
    this.amount = amount;
  }
}
