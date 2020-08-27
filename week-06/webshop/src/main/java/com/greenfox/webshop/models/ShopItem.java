package com.greenfox.webshop.models;

public class ShopItem {
  String name;
  String description;
  int price;
  int quantityOfStock;

  public ShopItem() {
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public int getPrice() {
    return price;
  }

  public int getQuantityOfStock() {
    return quantityOfStock;
  }
}
