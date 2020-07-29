package bunnies;

public class BunniesAgain {
    public static void main(String[] args) {
        System.out.println("Your bunnies, altogether have " +

                bunnieEarsAgain(-4) + " big floppy ears.");
    }


    public static int bunnieEarsAgain(int bunnieNum) {
        int earNum = 0;
        if (bunnieNum < 0) {
            System.out.println("Negative -> You don't have bunnies at all.");
            return 0;
        } else if (bunnieNum == 1) {
            return earNum + 1 + bunnieEarsAgain(bunnieNum - 1);
        } else if (bunnieNum == 0) {
            return earNum;
        } else {
            return (earNum + 3) + bunnieEarsAgain(bunnieNum - 2);
        }
    }

}
