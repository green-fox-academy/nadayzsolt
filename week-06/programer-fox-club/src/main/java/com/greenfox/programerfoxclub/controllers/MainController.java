package com.greenfox.programerfoxclub.controllers;

import com.greenfox.programerfoxclub.models.Fox;
import com.greenfox.programerfoxclub.services.FoxService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  FoxService foxService;


  public MainController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping("/login")
  public String loginEndPoint() {
    return "login";
  }

  @PostMapping("/login-result")
  public String loginPostPetName(String name) {
    List<String> foxNames = new ArrayList<>();
    for (Fox fox : foxService.foxes) {
      foxNames.add(fox.getName());
    }
    if (!foxNames.contains(name)) {
      Fox fox = new Fox (name);
      foxService.foxes.add(fox);
    }
    return"redirect:/?name="+name;
  }


  @GetMapping("/")
  public String loginGetPetName(Model model, @RequestParam(required = false) String name) {
    model.addAttribute("name", name);
    return "index";
  }
}
