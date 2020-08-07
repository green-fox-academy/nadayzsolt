package addNewTask;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddNewTask {
  static Path filePath = Paths.get("/home/zsolt/IdeaProjects/nadayzsolt/week-04/day-04/src/addNewTask/textAppended.txt");
  ;

  public static void main(String[] args) throws IOException {
    if (args[0].equals("-a") && args.length == 1) {
      System.out.println("Unable to add: no task provided");
    } else if (args[0].equals("-a") && args.length != 1) {
      System.out.println(args[1]);
      String theArg = "\n" + args[1];
      Files.write(filePath, theArg.getBytes(), StandardOpenOption.APPEND);
    } else if (args[0].equals("-r") && args.length == 2) {
      try {
        int i = Integer.parseInt(args[1]);
        manageTextAppendFile(i-1);
      } catch (NumberFormatException e) {
        System.out.println("Add a whole number!");
      }
    } else {
        System.out.println("Watch out, pal! It's a pity, You have access to this mighty program...");
      }
    }



  public static void manageTextAppendFile(int i) throws IOException {
    List<String> lines = new ArrayList<String>();
    lines = Files.readAllLines(filePath);
    lines.remove(i);
    Files.write(filePath, lines);
  }
}

