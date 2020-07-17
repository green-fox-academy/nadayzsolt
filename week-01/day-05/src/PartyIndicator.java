import java.util.Scanner;

public class PartyIndicator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String userInputGirls = "";
    System.out.print("Write here the number of girls: " + userInputGirls);
    userInputGirls = scanner.nextLine();

    scanner = new Scanner(System.in);
    String userInputBoys = "";
    System.out.print("Write here the number of boys: " + userInputBoys);
    userInputBoys = scanner.nextLine();


    int boysInt = Integer.parseInt(userInputBoys);
    int girlsInt = Integer.parseInt(userInputGirls);

    if (girlsInt + boysInt >= 20 && girlsInt == boysInt) {
      System.out.println("The party is excellent!");
    } else if (girlsInt + boysInt >= 20 && girlsInt != boysInt) {
      System.out.println("Quite cool party!");
    } else if (girlsInt == 0 && boysInt == 0) {
      System.out.println("No party :(");
    } else if (girlsInt + boysInt < 20) {
      System.out.println("Average party...");
    } else if (girlsInt == 0) {
      System.out.println("Sausage party");
    }


  }
}
