package emptyList;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class EmptyList {
  public static void main(String[] args) {
    Path filePath = Paths.get("/home/zsolt/IdeaProjects/nadayzsolt/week-04/day-04/src/emptyList/empty.txt");
    List<String> lines = null;
    try {
      lines = Files.readAllLines(filePath);

    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("brühbrühü");
    }
    if (args[0].equals("-l") && lines != null) {
      System.out.println("No todos for today! :)");
    }
  }
}

