package com.greenfox.programerfoxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {


//  @GetMapping("/")
//  public String indexEndPoint() {
//    return "index";
//  }


  @GetMapping("/login")
  public String loginEndPoint() {
    return "login";
  }

  @PostMapping("/login-result")
  public String loginPostPetName(String name) {

    return "redirect:/?name=" + name;
  }

  @GetMapping("/")
  public String loginGetPetName(Model model, @RequestParam(required = false) String name) {
    model.addAttribute("name", name);
    return "index";
  }
}
