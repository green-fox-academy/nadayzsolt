import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WriteSingleLine {
  public static void main(String[] args) {
    // Write a function that is able to manipulate a file
    // By writing your name into it as a single line
    // The file should be named "my-file.txt"
    // In case the program is unable to write the file,
    // It should print the following error message: "Unable to write file: my-file.txt"
    List<String> content = new ArrayList();
    content.add("Zsolt");
    valami(content);
  }

  public static void valami(List content) {
    try {
      Path filePath = Paths.get("src/my-file.txt");
      Files.write(filePath, content);
    } catch (Exception e) {
//      e.printStackTrace();
//      ez az amivel ki lehet iratni vele a kivételeket, és jobban múködik mint a rendszeranalitika
      System.out.println("Unable to write file: my-file.txt");
    }

  }
}
