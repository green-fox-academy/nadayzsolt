package com.example.backendapi.models;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class WelcomeMessage {

  @JsonProperty("welcome_message")
  private String message;

  public WelcomeMessage(String name, String title) {
    this.message = "Oh, hi there " + name + ", my dear " + title + "!";
  }
}
