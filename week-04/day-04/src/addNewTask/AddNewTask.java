package addNewTask;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

public class AddNewTask {
  static Path filePath = Paths
      .get("week-04\\day-04\\src\\addNewTask\\textAppended.txt");

  public static void main(String[] args) throws IOException {
    if (args[0].equals("-a") && args.length == 1) {
      System.out.println("Unable to add: no task provided");
    } else if (args[0].equals("-a") && args.length != 1) {
      System.out.println(args[1]);
      String theArg = "\n" + args[1];
      Files.write(filePath, theArg.getBytes(), StandardOpenOption.APPEND);
    } else if (args[0].equals("-r") && args[1].equals("2")) {
      manageTextAppendFile();
    } else {
      System.out.println("Watch out, pal! It's a pity, You have access to this mighty program...");
    }
  }

  public static void manageTextAppendFile() throws IOException {
    Scanner scanner = new Scanner(filePath);
    ArrayList<String> coll = new ArrayList<String>();
    scanner.nextLine();
    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      coll.add(line);
    }

    scanner.close();

    FileWriter writer = new FileWriter("week-04\\day-04\\src\\addNewTask\\textAppended.txt");
    String nullStr = "";
    for (int i = 0; i < coll.size(); i++) {
//      if (i == 1) {
//        writer.write(nullStr);
//      } else {
        writer.write("week-04\\day-04\\src\\addNewTask\\textAppended.txt");
//      }

      writer.close();
    }
  }
}
