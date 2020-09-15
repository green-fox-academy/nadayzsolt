package com.example.backendapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class Appended {
  @JsonProperty ("appended")
  String appended;

  public Appended(String appendable) {
    this.appended = appendable + "a";
  }
}
