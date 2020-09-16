package com.example.backendapi.services;

import com.example.backendapi.models.ArrayHandlerInput;
import com.example.backendapi.models.ArrayHandler;
import com.example.backendapi.models.ArrayHandlerWithArray;
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

  public ArrayHandler countArrayHandler(ArrayHandlerInput arrayHandlerInput) {

    int finalNumber = 0;
    if (arrayHandlerInput.getWhat().equals("sum")) {
      for (int i = 0; i < arrayHandlerInput.getNumbers().length; i++) {
        finalNumber += arrayHandlerInput.getNumbers()[i];
      }
    } else if (arrayHandlerInput.getWhat().equals("multiply")) {
      finalNumber = 1;
      for (int i = 0; i < arrayHandlerInput.getNumbers().length; i++) {
        finalNumber *= arrayHandlerInput.getNumbers()[i];
      }
    }
    return new ArrayHandler(finalNumber);

  }

  public ArrayHandlerWithArray countArrayHandlerWithArray(ArrayHandlerInput arrayHandlerInput) {
    ArrayHandlerWithArray arrayHandlerWithArray = new ArrayHandlerWithArray();
    if (arrayHandlerInput.getWhat().equals("double")) {
//      ha csak a hossza kell / vagy b megoldás:
//      arrayHandlerWithArray.setResult(new int [arrayHandlerInput.getNumbers().length]);
//      arrayHandlerWithArray.setResult(arrayHandlerInput.getNumbers());
//      for (int i = 0; i < arrayHandlerWithArray.getResult().length; ++i) {
//        arrayHandlerWithArray.setResultElement(arrayHandlerInput.getNumbers()[i] * 2, i);
//      }

      int [] tempInt =  arrayHandlerInput.getNumbers();
      for (int i = 0; i < tempInt.length; ++i) {
        tempInt[i] = tempInt[i] * 2;
      }
      arrayHandlerWithArray.setResult(tempInt);
    }
    return arrayHandlerWithArray;
  }
}
