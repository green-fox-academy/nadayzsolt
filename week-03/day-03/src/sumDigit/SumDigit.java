package sumDigit;

public class SumDigit {
  public static void main(String[] args) {
    System.out.println(theSumMaker(2456));
  }

  public static int theSumMaker(int n) {
    if (n <= 0) {
      System.out.println("negatív szám");
      return 0;
    }
    else if (n == n % 10) {
      return n;
    }
    else {
      return n % 10 + theSumMaker(n / 10);
    }
  }
}
