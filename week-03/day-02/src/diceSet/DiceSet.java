package diceSet;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiceSet {
  ArrayList<Integer> dice = new ArrayList<>();

  public List<Integer> roll() {
    for (int i = 0; i < 6; i++) {
      dice.add((int) (Math.random() * 6) + 1);
    }
    return dice;
  }

  public List<Integer> getCurrent() {
    return dice;
  }

  public int getCurrent(int i) {
    return dice.get(i);
  }

  public void reroll() {
    for (int i = 0; i < dice.size(); i++) {
      dice.set(i, (int) (Math.random() * 6) + 1);
    }
  }

  public void reroll(int k) {
    dice.set(k, (int) (Math.random() * 6) + 1);
  }

  public static void main(String[] args) {
    // You have a `DiceSet` class which has a list for 6 dice
    // You can roll all of them with roll()
    // Check the current rolled numbers with getCurrent()
    // You can reroll with reroll()
    // Your task is to roll the dice until all of the dice are 6

    DiceSet diceSet1 = new DiceSet();
    diceSet1.roll();
    diceSet1.whateverDice(diceSet1.getCurrent());
    System.out.println(diceSet1.getCurrent());
  }

  public void whateverDice(List<Integer> dice) {
    for (int i = 0; i < dice.size(); i++) {
      if (dice.get(i) == 6) {
        continue;
      } else {
        while (dice.get(i) != 6) {
          reroll(i);
        }
      }

    }
  }

}
