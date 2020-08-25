import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import sun.text.normalizer.UCharacter;

public class Exercise8 {
  public static void main(String[] args) {
//    Write a Stream Expression to concatenate a Character list to a string!
    List<Character> characters = new ArrayList<>(Arrays.asList('B', 'e', 'l', 'a'));
    String word =  characters.stream()
        .map(ch->ch.toString())
        .collect(Collectors.joining());
    System.out.println(word);
  }
}
