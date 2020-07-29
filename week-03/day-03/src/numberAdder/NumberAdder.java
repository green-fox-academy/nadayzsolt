package numberAdder;

import java.util.List;

public class NumberAdder {
  public static void main(String[] args) {
    int sum = theAdder(9);
    System.out.println(sum);
//    System.out.println(theAdder(10)); // or just simply print it as such
  }

  public static int theAdder(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n + theAdder(n - 1);
    }
  }
}
