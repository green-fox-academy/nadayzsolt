package addNewTask;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AddNewTask {
  static Path filePath = Paths
      .get("week-04\\day-04\\src\\addNewTask\\textAppended.txt");

  public static void main(String[] args) throws IOException {
    if (args[0].equals("-a") && args.length == 1) {
      System.out.println("Unable to add: no task provided");
    } else if (args[0].equals("-a") && args.length != 1){
      System.out.println(args[1]);
      String theArg = "\n" + args[1];
      Files.write(filePath, theArg.getBytes(), StandardOpenOption.APPEND);
    } else{
      System.out.println("bad operation");
    }
  }
}
