import java.util.Scanner;

public class CountFromTo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String userInput1 = "";
    System.out.print("Write here the first number: " + userInput1);
    userInput1 = scanner.nextLine();

    scanner = new Scanner(System.in);
    String userInput2 = "";
    System.out.print("Write here the second number: " + userInput2);
    userInput2 = scanner.nextLine();

//    Here we are, finally, here is the solution to scan the numbers:
//    Scanner scanner = new Scanner(System.in);
//    int userInput2 = 0;
//    System.out.print("Write here the second number: ");
//    userInput2 = scanner.nextInt();
//    System.out.println(userInput2);


    int myInteger1 = Integer.parseInt(userInput1);
    int myInteger2 = Integer.parseInt(userInput2);

    for (int i = myInteger1; i < myInteger2; i++) {
      if (myInteger2 > myInteger1) {
        System.out.println(i);
      }
    }
    if (myInteger2 <= myInteger1) {
      System.out.println("The second number should be bigger");
    }
  }
}

