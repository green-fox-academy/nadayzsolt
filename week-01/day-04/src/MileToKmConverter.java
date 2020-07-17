import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        Scanner scanner = new Scanner(System.in);
        String userInput2 = "";
        System.out.print("Write here the distance in miles: " + userInput2);
        userInput2 = scanner.nextLine();
        double myNewDouble = Double.parseDouble(userInput2);
        System.out.println("The distance is " + myNewDouble * 0.62137119223733 + "km.");


    }
}
