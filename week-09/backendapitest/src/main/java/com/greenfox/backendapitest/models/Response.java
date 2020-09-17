package com.greenfox.backendapitest.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Response {
  private String received;
  private String translated;

  public Response(String received, String translated) {
    this.received = received;
    this.translated = translated;
  }
}
