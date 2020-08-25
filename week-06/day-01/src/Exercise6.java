import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise6 {
  public static void main(String[] args) {
//    Write a Stream Expression to find the uppercase characters in a string!
    String belaStr = "bbsfABCffeDEFsdGHIbd";
    List<Character> charStream = belaStr.chars()
      .mapToObj(ch -> (char) ch)
        .filter(Character::isUpperCase)
        .collect(Collectors.toList());
    System.out.println(charStream);
  }
}