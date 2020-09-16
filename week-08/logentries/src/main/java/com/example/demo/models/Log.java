package com.example.demo.models;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Log {
  @Id
  Timestamp createdAt;
  String endPoint;
  String data;
}
