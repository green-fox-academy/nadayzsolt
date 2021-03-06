package com.greenfox.webshop.models;

public class ShopItem implements Comparable<ShopItem>{
  String name;
  String description;
  double price;
  int quantityOfStock;

  public ShopItem() {
  }

  public ShopItem(String name, String description, double price, int quantityOfStock) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantityOfStock = quantityOfStock;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantityOfStock() {
    return quantityOfStock;
  }

  @Override
  public int compareTo(ShopItem o) {
    return Double.compare(this.price, o.price);
  }
}
