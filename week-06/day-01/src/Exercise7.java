import java.util.Arrays;
import java.util.List;

public class Exercise7 {
  public static void main(String[] args) {
//    Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:
    List<String>
        cities = Arrays
        .asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM",
            "ABU DHABI", "PARIS");
    cities.stream()
        .filter(word -> word.startsWith("Z"))
        .forEach(System.out::println);
  }
}
