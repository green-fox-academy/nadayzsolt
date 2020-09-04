package com.greenfox.programerfoxclub.services;

import com.greenfox.programerfoxclub.models.Fox;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FoxService {
  private List<Fox> foxes;
  private String[] foodArray = {"Bela", "cica", "paci", "elefant", "zoeldseg"};
  private List<String> foods = new ArrayList<String>(Arrays.asList(foodArray));
  private String[] drinkArray = {"Spirytus", "Miod pitny", "Kwas", "Orzechowka", "Warka Strong"};
  private List<String> drinks = new ArrayList<String>(Arrays.asList(drinkArray));
  private String[] trickArray = {"drink Spirytus", "drink Miod pitny", "drink Kwas", "drink Orzechowka", "drink Warka Strong"};
  private List<String> tricks = new ArrayList<String>(Arrays.asList(trickArray));

  public FoxService() {
    this.foxes = new ArrayList<>();
  }

  public List<Fox> getFoxes() {
    return foxes;
  }

  public void addFoxes(String name) {
    foxes.add(new Fox(name));
  }

  public Fox selectFoxesByName(String name){
    return getFoxes().stream().filter(fox -> fox.getName().equals(name)).findFirst()
            .orElse(null);
  }

  public List<String> getFoods() {
    return foods;
  }

  public List<String> getDrinks() {
    return drinks;
  }

  public List<String> getTricks() {
    return this.tricks;
  }
}
