package toDoList;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ToDoList {
  static Path filePath = Paths.get("week-04\\day-04\\src\\addNewTask\\textAppended.txt");
  static List<String> lines = new ArrayList<String>();

//  Command line arguments:
//    -l   Lists all the tasks
//    -a   Adds a new task
//    -r   Removes the task from the line numbered after command
////    -c   Completes an task (not done)

  public static void main(String[] args) throws IOException {
    lines = Files.readAllLines(filePath);
    if (args[0].equals("-a") && args.length == 1) {
      System.out.println("Unable to add: no task provided");
    } else if (args[0].equals("-a") && args.length == 2) {
      System.out.println(args[1]);
      String theArg = "\n" + args[1];
      Files.write(filePath, theArg.getBytes(), StandardOpenOption.APPEND);
    } else if (args[0].equals("-a") && args.length >= 2) {
      System.out.println("Unable to add: more than 1 task provided - try with between qoute marks");
    } else if (args[0].equals("-l") && lines.size() >= 1) {
      listMyTasks(args);
    } else if (args[0].equals("-l")) {
      System.out.println("No todos for today! :)");
    } else if (args[0].equals("-r") && args.length == 2) {
      try {
        int i = Integer.parseInt(args[1]);
        removeThisLine(i - 1);
      } catch (NumberFormatException e) {
        System.out.println("Add a whole number!");
      } catch (IndexOutOfBoundsException e) {
        System.out.println("There is no " + args[1] + ". line. (Therefor U cannot remove it!)");
      }
    } else {
      System.out.println("Watch out, pal! It's a pity, You have access to this mighty program...");
    }
  }
  public static void removeThisLine(int i) throws IOException {
    lines.remove(i);
    Files.write(filePath, lines);
  }
  public static void listMyTasks(String[] args) {
    int index = 0;
    for (String bela : lines) {
      System.out.print(++index + ". ");
      System.out.println(bela);
    }
  }
}



