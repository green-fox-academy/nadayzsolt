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


    for (int i = 1; i < inputInt; i++) {
      System.out.println("");
      for (int j = 1; j < inputInt; j++) {
        if (i == 1 || i == inputInt - 1 || j == 1 || j == inputInt - 1 || i == j) {
          System.out.print("%");
        } else {
          System.out.print(" ");
        }
//          for (int z = 0; z < i + 1; j++) {
//            if (z == 1 || z == inputInt - 1)
//              System.out.print("%");
      }

    }
  }
}


//        else if (inputInt % inputInt == i) {
//          System.out.print(i + "x" + j + "%");
//        } else {
//          System.out.print(i + "x" + j + " " );
