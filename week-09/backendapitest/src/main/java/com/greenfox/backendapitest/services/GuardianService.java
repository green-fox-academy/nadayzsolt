package com.greenfox.backendapitest.services;

import com.greenfox.backendapitest.models.Cargo;
import com.greenfox.backendapitest.models.ReceivedCargo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Setter
@Getter
@Service
@NoArgsConstructor
public class GuardianService {
private Cargo cargo = new Cargo();
private ReceivedCargo receivedCargo = new ReceivedCargo();

  public void setDifferentCalAmounts (String caliber, int amount) {
    if (caliber.equals(".25")) {
      cargo.setCaliber25(cargo.getCaliber25() + amount);
    } else if (caliber.equals(".30")) {
      cargo.setCaliber30(cargo.getCaliber30() + amount);
    } else if (caliber.equals(".50")){
      cargo.setCaliber50(cargo.getCaliber50() + amount);
    }
  }

  public void setCargoShipStatus (){
    int overallAmount = cargo.getCaliber25()+cargo.getCaliber30()+cargo.getCaliber50();
    double loadingPercentage = overallAmount * 100 / 12500;
    String redundantStatus = loadingPercentage <= 0 ? "emptier" : loadingPercentage < 100 ? String.valueOf(loadingPercentage) + "%": loadingPercentage ==
        100 ? "full": "overloaded";
    cargo.setShipStatus(redundantStatus);
    boolean redundantReady = cargo.getShipStatus().equals("full");
    cargo.setReady(redundantReady);

  }

  public void setReceivedCargoShipStatus (String caliber, int amount){
    receivedCargo.setReceived(caliber);
    receivedCargo.setAmount(amount);
    receivedCargo.setShipStatus(cargo.getShipStatus());
    receivedCargo.setReady(cargo.isReady());
  }
}
