package com.greenfox.webshop.controllers;

import java.util.ArrayList;
import java.util.List;
import com.greenfox.webshop.models.ShopItem;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ItemController {

  List<ShopItem> shopItems = new ArrayList<>();
  List<ShopItem> itemsContainingSearchName = new ArrayList<>();

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

  @GetMapping("/only-available")
  public String listAvailableItems(Model model) {
    List<ShopItem> availableItems = shopItems.stream()
        .filter(shopItem -> shopItem.getQuantityOfStock() != 0)
        .collect(Collectors.toList());
    model.addAttribute("availableItems", availableItems);
    return "only-available";
  }

  @GetMapping("/cheapest-first")
  public String listByIncreasingPrice(Model model) {
    List<ShopItem> itemsSortedByIncreasingPrice = shopItems.stream()
        .sorted((shopItem1, shopItem2) -> (int) (shopItem1.getPrice() - shopItem2.getPrice()))
        .collect(Collectors.toList());
    model.addAttribute("itemsSortedByIncreasingPrice", itemsSortedByIncreasingPrice);
    return "cheapest-first";
  }

  @GetMapping("/contains-nike")
  public String listItemsContainingNike(Model model) {
    List<ShopItem> itemsContainingNike = shopItems.stream()
        .filter(shopItem -> shopItem.getDescription().contains("Nike") ||
            shopItem.getName().contains("Nike"))
        .collect(Collectors.toList());
    model.addAttribute("itemsContainingNike", itemsContainingNike);
    return "contains-nike";
  }

  @GetMapping("/average-stock")
  public String getAverageStock(Model model) {
    OptionalDouble averageStockObject = shopItems.stream()
        .mapToInt(ShopItem::getQuantityOfStock)
        .average();
    double averageStock = averageStockObject.orElse(-1);
    model.addAttribute("averageStock", averageStock);
    return "average-stock";
  }

  @GetMapping("/most-expensive")
  public String getMostExpensive(Model model) {
    List<ShopItem> itemsSortedByIncreasingPrice = shopItems.stream()
        .sorted((shopItem1, shopItem2) -> (int) (shopItem1.getPrice() - shopItem2.getPrice()))
        .collect(Collectors.toList());
    double mostExpensivePrice =
        itemsSortedByIncreasingPrice.get(itemsSortedByIncreasingPrice.size() - 1).getPrice();
    model.addAttribute("mostExpensivePrice", mostExpensivePrice);
    String mostExpensiveName =
        itemsSortedByIncreasingPrice.get(itemsSortedByIncreasingPrice.size() - 1).getName();
    model.addAttribute("mostExpensiveName", mostExpensiveName);
    String mostExpensiveDescription =
        itemsSortedByIncreasingPrice.get(itemsSortedByIncreasingPrice.size() - 1).getDescription();
    model.addAttribute("mostExpensiveDescription", mostExpensiveDescription);
    return "most-expensive";
  }

  @GetMapping("/search-result")
  public String listItemsContainingSearchedElement(Model model) {
    model.addAttribute("itemsContainingSearchName", itemsContainingSearchName);
    return "search-result";
  }

  @PostMapping("/search-result")
  public String getSearchString(String searchName) {
    itemsContainingSearchName = shopItems.stream()
        .filter(shopItem -> shopItem.getDescription().contains(searchName) ||
            shopItem.getName().contains(searchName))
                .collect(Collectors.toList());
    return "redirect:/search-result";
  }
}