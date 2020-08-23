import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
  public static void main(String[] args) {
    // Write a function that is able to manipulate a file
    // By writing your name into it as a single line
    // The file should be named "my-file.txt"
    // In case the program is unable to write the file,
    // It should print the following error message: "Unable to write file: my-file.txt"
    List<String> content = new ArrayList<>();
    content.add("Zsolt");
    content.add("Béla");
    content.add("Bélus");
    content.add("Bélás");
    writeFile(content);
  }

  public static void writeFile(List<String> content) {
    try {
      Path filePath = Paths.get("week-02/day-03/assets/my-file.txt");
      Files.write(filePath, content);
      System.out.println("File successfully overwritten.");
    } catch (Exception e) {
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}
