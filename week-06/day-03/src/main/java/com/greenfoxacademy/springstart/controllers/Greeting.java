package com.greenfoxacademy.springstart.controllers;


public class Greeting {
  private long id;
  private String content;
  private long counter;

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

  public long getCounter() {
    return counter;
  }

  public Greeting(String content) {
    this.content = content;
  }

  public Greeting(long id, String content, long counter) {
    this.id = id;
    this.content = content;
    this.counter = counter;
  }
}