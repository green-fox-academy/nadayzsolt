package com.greenfox.programerfoxclub.controllers;

import com.greenfox.programerfoxclub.models.Fox;
import com.greenfox.programerfoxclub.services.FoxService;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  FoxService foxService;

  @Autowired
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
//    System.out.println(foxNames);
    if (!foxNames.contains(name)) {
      foxService.foxes.add(new Fox(name));
    }
    return "redirect:/?name=" + name;
  }


  @GetMapping("/")
  public String loginGetPetName(Model model, @RequestParam(required = false) String name) {
    model.addAttribute("name", name);
    Fox existFox =
        foxService.foxes.stream().filter(fox -> fox.getName().equals(name)).findFirst()
            .orElse(null);
    model.addAttribute("food", existFox.getFood());
    model.addAttribute("drink", existFox.getDrink());
    int tricksAmount = existFox.getTricks().size();
    model.addAttribute("trickAmount", tricksAmount);
    if (tricksAmount > 1) {
      model.addAttribute("trickcanbeplural", "s");
    } else {
      model.addAttribute("trickcanbeplural", "");
    }
    if (tricksAmount > 0) {
      model.addAttribute("tricks", existFox.getTricks());
    } else {
      model.addAttribute("tricks", "You know no tricks, yet. Go and learn some.");
    }
    return "index";
  }
}