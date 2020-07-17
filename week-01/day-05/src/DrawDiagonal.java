import java.util.Scanner;

// Write a program that reads a number from the standard input, then draws a
// square like this:

public class DrawDiagonal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String userInput = "";
    System.out.println("Add your number: " + userInput);
    userInput = scanner.nextLine();
    int inputInt = Integer.parseInt(userInput);

    for (int i = 1; i < inputInt + 1; i++) {
      if (i % 5 == 0 || i % 5 == 1) {
        System.out.println("%%%%%");
      } else if (i % 5 == 2) {
        System.out.println("%%  %");
      } else if (i % 5 == 3) {
        System.out.println("% % %");
      } else if (i % 5 == 4) System.out.println("%  %%");
    }
  }
}