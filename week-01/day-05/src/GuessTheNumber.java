import java.util.Scanner;

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
