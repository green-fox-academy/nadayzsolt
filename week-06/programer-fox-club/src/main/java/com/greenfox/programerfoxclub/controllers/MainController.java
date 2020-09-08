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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    for (Fox fox : foxService.getFoxes()) {
      foxNames.add(fox.getName());
    }
//    System.out.println(foxNames);
    if (!foxNames.contains(name)) {
      foxService.addFoxes(name);
    }
    return "redirect:/?name=" + name;
  }

  @PostMapping("/nutrition-result")
  public String loginPostPetName(String food, String drink,
                                 @RequestParam(required = false) String name) {
    Fox selectedFox = foxService.selectFoxesByName(name);
    if (drink != null) selectedFox.setDrink(drink);
    if (food != null) selectedFox.setFood(food);
    return "redirect:/?name=" + name;
  }

  @GetMapping("/")
  public String loginGetPetName(Model model, @RequestParam(required = false) String name) {
    Fox selectedFox = foxService.selectFoxesByName(name);
    model.addAttribute("name", selectedFox.getName());
    model.addAttribute("food", selectedFox.getFood());
    model.addAttribute("drink", selectedFox.getDrink());
    model.addAttribute("trickstolearn", foxService.getTricks());

    int tricksAmount = selectedFox.getTricks().size();
    model.addAttribute("trickAmount", tricksAmount);
    String nothingOrPluralEnding = (tricksAmount != 1) ? "s" : "";
    model.addAttribute("nothingOrPluralEnding", nothingOrPluralEnding);

    if (tricksAmount > 0) {
      model.addAttribute("tricks", selectedFox.getTricks());
    } else {
      model.addAttribute("tricks", "You know no tricks, yet. Go and learn some.");
    }

    model.addAttribute("foods", foxService.getFoods());
    model.addAttribute("drinks", foxService.getDrinks());
    return "index";
  }


  @RequestMapping(value = {"/nutritionStore"}, method = RequestMethod.GET)
  public String feedTheFox(Model model, @RequestParam(required = false) String name) {

    model.addAttribute("name", name);
    model.addAttribute("foods", foxService.getFoods());
    model.addAttribute("drinks", foxService.getDrinks());
    return "fox-nutrition";
  }

  @GetMapping("/trickCenter")
  public String manageTricks(Model model, @RequestParam(required = false) String name) {
    model.addAttribute("name", name);
    model.addAttribute("trickstolearn", foxService.getTricks());
    Fox selectedFox = foxService.selectFoxesByName(name);
    model.addAttribute("tricks", selectedFox.getTricks());
    return "trick-center";
  }

  @PostMapping("/trick-result")
  public String manageTricks(String trick, String deltrick,
                                 @RequestParam(required = false) String name) {
    Fox selectedFox = foxService.selectFoxesByName(name);
    if (!selectedFox.getTricks().contains(trick)) selectedFox.addTricks(trick);
    // del function generates problem, cause trickcounter in the text, after a few iteration, sometimes counts an empty item as well, and becomes untrustworthy!
    selectedFox.delTricks(deltrick);
    return "redirect:/?name=" + name;
  }


}