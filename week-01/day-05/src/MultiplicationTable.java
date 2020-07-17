import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String userInput = "";
    System.out.println("Add the number to be multiplied: " + userInput);
    userInput = scanner.nextLine();


    int inputInt = Integer.parseInt(userInput);
    for (int i = 1; i < 11; i++) {
      System.out.println(i + " * " + inputInt + " = " + i * inputInt);
    }

  }
}
