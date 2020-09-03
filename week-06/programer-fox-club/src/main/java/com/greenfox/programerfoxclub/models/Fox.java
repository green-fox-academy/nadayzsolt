package com.greenfox.programerfoxclub.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {
  private String name;
  private List<String> tricks = new ArrayList<>();
  private String food;
  private String drink;

  public Fox(String name, List<String> tricks, String food, String drink) {
    this.name = name;
    this.tricks = tricks;
    this.food = food;
    this.drink = drink;
  }

  public Fox(String name) {
    this.name = name;
    this.tricks.add("catching sugar");
    this.food = "sugar";
    this.drink = "sugardrink";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getTricks() {
    return tricks;
  }

  public void setTricks(List<String> tricks) {
    this.tricks = tricks;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }
}
