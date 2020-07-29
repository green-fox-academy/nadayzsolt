package sumDigit;

//      Given a non-negative integer n, return the sum of its digits recursively (without loops).
//              Hint
//      Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
//      Java, C++, C#, Python
//      Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).
//      JavaScript, TypeScript
//      There is no integer type in JavaScript. To remove the rightmost digit you must divide (/)
//      the number by 10 and find a way to get the the whole number portion of that number.

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