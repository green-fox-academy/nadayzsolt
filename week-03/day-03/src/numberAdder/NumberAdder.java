package numberAdder;

import java.util.List;

public class NumberAdder {
  public static void main(String[] args) {
    System.out.println(theAdder(8));

  }

  public static int theAdder(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n + theAdder(n - 1);
    }
  }
}
