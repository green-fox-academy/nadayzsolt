package com.homework.homework.util;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LoginOkResponse {
  private String token;
  private int dollarAmount;

  public LoginOkResponse(String token, int dollarAmount) {
    this.token = token;
    this.dollarAmount = dollarAmount;
  }
}
