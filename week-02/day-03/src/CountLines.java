import java.nio.file.NoSuchFileException;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountLines {
  public static void main(String[] args) {
// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
    System.out.println("Number of lines: " + fileRead("week-02/day-03/assets/my-file.txt"));
  }
  public static int fileRead(String pathName) {
    int numOfLines = 0;
    Path filePath = Paths.get(pathName);
    try {
      List<String> lines = Files.readAllLines(filePath);
      for (String line : lines) {
        ++numOfLines;
      }
    } catch (
        IOException e) {
      System.out.println(e);
      //   ezzel raiselne errort:   e.printStackTrace();
      return 0;
    }
    return numOfLines;
  }
}