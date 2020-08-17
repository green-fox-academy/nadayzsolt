import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
  public static void main(String[] args) {
    writeIntoFile("week-02/day-03/assets/my-file.txt", "apple", 5);
  }

  public static void writeIntoFile (String path, String word, int lineNumber){
    Path filePath = Paths.get(path);
    List<String> wordList = new ArrayList<>();
    for (int i = 0; i < lineNumber; i++) {
      wordList.add(word);
    }
    try {
      Files.write(filePath, wordList);
      System.out.println("File successfully overwritten.");
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}