package com.greenfox.webshop.controllers;

import java.util.ArrayList;
import java.util.List;
import com.greenfox.webshop.models.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemController {

  List<ShopItem> shopItems = new ArrayList<>();

  @GetMapping("/")
  public String listShopItems(Model model) {
    model.addAttribute("shopItems", shopItems);
    return "index";
  }

}
