package exercise10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    List<Fox> foxes = new ArrayList<>();
    Fox fox0 = new Fox("Bela", "red", 2);
    foxes.add(fox0);
    Fox fox1 = new Fox("Becike", "green", 1);
    foxes.add(fox1);
    Fox fox2 = new Fox("Beluska", "green", 5);
    foxes.add(fox2);
    Fox fox3 = new Fox("Belus", "pink", 2);
    foxes.add(fox3);
    Fox fox4 = new Fox("Belacska", "green", 2);
    foxes.add(fox4);

    List<Fox> greenYoungFoxes = foxes.stream()
        .filter(fox -> fox.color.equals("green") && fox.age < 5)
        .collect(Collectors.toList());
    for (Fox fox : greenYoungFoxes) {
      System.out.println(fox.name + " is " + fox.color + " & " + fox.age + " year(s) old.");
    }

    Map<String, Long> colorFrequency = foxes.stream()
        .map(fox -> fox.color)
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    System.out.println(colorFrequency);
  }
}
