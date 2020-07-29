package power;

// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

public class Power {
    public static void main(String[] args) {
        int sum = powerFunc(-10, 9);
        System.out.println(sum);
    }

    public static int powerFunc(int base, int depth) {
        if (base <= 0 || depth <= 0) {
            System.out.println("no cool");
            return 0;
        } else if (depth == 1) {
            return base;
        } else {
            return base * powerFunc(base, depth - 1);
        }
    }
}
