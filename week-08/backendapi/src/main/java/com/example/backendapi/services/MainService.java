package com.example.backendapi.services;

import com.example.backendapi.models.InputSumFactor;
import com.example.backendapi.models.SumFactor;
import org.springframework.stereotype.Service;

@Service
public class MainService {

  public SumFactor countSumOrFactor(String action, InputSumFactor inputSumFactor) {

    int finalNumber = 1;
    if (action.equals("sum")) {
      for (int i = 2; i <= inputSumFactor.getUntil(); i++) {
        finalNumber += i;
      }
    } else if (action.equals("factor")) {
      for (int i = 1; i <= inputSumFactor.getUntil(); i++) {
        finalNumber *= i;
      }
    }
    return new SumFactor(finalNumber);
  }
}
