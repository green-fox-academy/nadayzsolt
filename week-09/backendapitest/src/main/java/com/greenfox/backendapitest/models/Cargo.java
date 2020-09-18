package com.greenfox.backendapitest.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cargo {
  private int caliber25;
  private int caliber30;
  private int caliber50;
  private String shipStatus;
  private boolean ready;

//  public Cargo() {
//    int loadingPercentage = (caliber25+caliber30+caliber50) / 12500 * 100;
//    this.shipstatus = loadingPercentage <= 0 ? "empty" : loadingPercentage < 100 ? String.valueOf(loadingPercentage) + "%": loadingPercentage ==
//        100 ? "full": "overloaded";
//    this.ready = shipstatus.equals("full");
//  }


  public Cargo() {
    shipStatus = "empty";
  }
}
