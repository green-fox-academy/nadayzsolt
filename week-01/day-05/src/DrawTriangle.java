import java.util.Scanner;

// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:

public class DrawTriangle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String userInput = "";
    System.out.println("Add your number: " + userInput);
    userInput = scanner.nextLine();
    int inputInt = Integer.parseInt(userInput);

    for (int i = 1; i < inputInt+1; i++) {
      System.out.println("");
      for (int j = 1; j < i+1; j++) {
        System.out.print("*");
      }
    }
  }
}
