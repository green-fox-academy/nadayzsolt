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

  public ItemController() {
    shopItems.add(
        new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000.0, 5));
    shopItems.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000.0, 2));
    shopItems.add(new ShopItem("Coca cola", "0.5l standard coke", 25.0, 0));
    shopItems
        .add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN souce", 119.0, 100));
    shopItems.add(new ShopItem("T-shirt", "Blue with a corgi on a bike", 300.0, 1));
  }

  @GetMapping("/")
  public String listShopItems(Model model) {
    model.addAttribute("shopItems", shopItems);
    return "index";
  }

}
