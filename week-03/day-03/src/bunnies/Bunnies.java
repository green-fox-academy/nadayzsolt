package bunnies;

//We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies
// recursively (without loops or multiplication).

public class Bunnies {
    public static void main(String[] args) {
        System.out.println("The bunnies, altogether have " + bunnieEars(5) + " big floppy ears.");

    }

    public static int bunnieEars(int bunnieNum) {
        int earNum = 0;
        if (bunnieNum < 0) {
            System.out.println("Negative -> You don't have bunnies at all.");
            return 0;
        }
        else if (bunnieNum == 0) {
            return earNum;
        }
        else {
            return (earNum + 2) +  bunnieEars(bunnieNum-1);
        }
    }
}
