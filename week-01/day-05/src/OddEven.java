import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        Scanner scanner = new Scanner(System.in);
        String userInput2 = "";
        System.out.print("Write here the number, you are not sure even or odd: " + userInput2);
        userInput2 = scanner.nextLine();
        int   myNewInt    = Integer.parseInt(userInput2);
        boolean trueOrFalse = myNewInt % 2 == 0;

        System.out.println("If you expected your number even, your expectation is " + trueOrFalse + ".");
    }

}
