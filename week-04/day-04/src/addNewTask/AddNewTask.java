package addNewTask;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class AddNewTask {
  static Path filePath = Paths.get("week-04/day-04/src/addNewTask/textAppended.txt");

  public static void main(String[] args) throws IOException {
    for (int i = 1; i < args.length; i++) {
      String theArg = "";
      if (args[0].equals("-a")) {
        theArg = args[i] + "\n";
      }
      System.out.println(theArg);
      Files.write(filePath, theArg.getBytes(), StandardOpenOption.APPEND);
    }
  }
}
