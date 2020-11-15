package com.homework.homework;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Response {
  private String message;

  public Response(String message) {
    this.message = message;
  }
}
