import java.util.Scanner;

// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:

public class GuessTheNumber {
  public static void main(String[] args) {
    int myInteger = 5787;
    Scanner scanner = new Scanner(System.in);
    String userInput = "";
    System.out.println("Your guess: " + userInput);
    userInput = scanner.nextLine();
    int inputInteger = Integer.parseInt(userInput);

    if (inputInteger == myInteger) {
      System.out.println("You found the number: " + myInteger);
    } else if (inputInteger > myInteger) {
      System.out.println("The stored number is lower");
    } else if (inputInteger < myInteger) {
      System.out.println("The stored number is higher");
    }

  }
}
