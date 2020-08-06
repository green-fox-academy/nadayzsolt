package listTasks;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    if (args[0].equals("-l")) {
      Path filePath = Paths.get("/home/zsolt/IdeaProjects/nadayzsolt/week-04/day-04/src/listTasks/file.txt");
      List<String> lines = null;
      try {
        lines = Files.readAllLines(filePath);
        int index = 0;
        for (String bela : lines) {
          System.out.print(++index + ". ");
          System.out.println(bela);
        }
      } catch (Exception e) {
        e.printStackTrace();
        System.out.println("brühbrüh");
      }
    }
  }
}
