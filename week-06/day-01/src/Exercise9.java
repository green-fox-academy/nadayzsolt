import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise9 {
  public static void main(String[] args) {
//    Write a Stream Expression to find the frequency of characters in a given string!
    String bela = "sdkfjnkjlfnrlnwefm";

    Stream<String> stringStream = bela.codePoints()
        .mapToObj(c -> String.valueOf((char) c));

    Map<String, Long> charFrequency = stringStream
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    System.out.println(charFrequency);
  }
}
