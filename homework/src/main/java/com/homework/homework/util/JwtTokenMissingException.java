package com.homework.homework.util;

public class JwtTokenMissingException extends RuntimeException {
  public JwtTokenMissingException(String message) {
    super(message);
  }
}
