package com.homework.homework.util;

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
