package exercise11;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//    Find a random Wikipedia article and copy the contents to a txt file.
//
//    Create a Stream expression which reads all text from this file,
//    and prints the 100 most common words in descending order.
//    Keep in mind that the text contains punctuation characters which should be ignored.
//    he result should be something like this:
//    the: 131
//    of: 74
//    and: 48
//    ...

public class Exercise11 {

  public static void main(String[] args) {
    Path filePath = Paths.get("week-06/day-01/src/exercise11/network-affiliation.txt");
    List<String> lines = new ArrayList<>();
    try {
      lines = Files.readAllLines(filePath);
    } catch (Exception e) {
      System.out.print("Unable to read file: my-file.txt");
    }
    String wikiStr = String.join(",", lines)
        .replaceAll("[,.!?;()\"'0-9-$]", "")
        .replace("[]", "");

    List<String> wikiWords = Arrays.asList(wikiStr.split(" "));

//    Map<String, Long> wordFreq = wikiWords.stream()
//        .map(String::toLowerCase)
//        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//        .entrySet()
//        .stream()
//        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//        .limit(100);
// Visszatérünk rá...

  }
}
