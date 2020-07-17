import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput2 = "";
        System.out.print("Write here the number, you are not sure even or odd: " + userInput2);
        userInput2 = scanner.nextLine();
        int myNewInt = Integer.parseInt(userInput2);
        if (myNewInt <= 0) {
            System.out.println("Not enough");
        } else if (myNewInt == 1) {
            System.out.println("One");
        } else if (myNewInt == 2) {
            System.out.println("Two");
        } else {
            System.out.println("A lot");
        }
    }
}
