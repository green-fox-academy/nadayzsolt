package com.example.backendapi.models;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@NoArgsConstructor
public class Logger {
  @Id
  private Timestamp createdAt;
  private String endPoint;
  private String data;


  public void log() {
    System.out.println("Logger printing message - Time: " + createdAt + " - endPoint: " + endPoint + " - data "+ data);
  }
}
