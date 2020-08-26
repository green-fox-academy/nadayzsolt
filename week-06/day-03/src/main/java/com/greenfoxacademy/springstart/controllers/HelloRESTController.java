package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  AtomicLong atomicLong = new AtomicLong();
  @RequestMapping(value = "/greeting")
  public Greeting greeting(@RequestParam String name) {
    return new Greeting(0, "Hello " + name, atomicLong.incrementAndGet());
  }
//  @RequestMapping(value = "greeting")
//  public Greeting greeting(@RequestParam String name) {
//    return new Greeting(1, "Hello " + name);
//  }
//    @RequestMapping(value = "greeting")
//    public Greeting greeting (){
//      return new Greeting(1, "Hello World!");
//  }
}
