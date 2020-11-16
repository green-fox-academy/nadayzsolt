package com.homework.homework.util;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class InvalidIdException extends Throwable {
  public InvalidIdException(String message) {
    super(message);
  }
}
