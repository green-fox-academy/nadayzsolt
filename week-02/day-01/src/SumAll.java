public class SumAll {
  public static void main(String[] args) {
    int[] numbers = new int[5];
    int startingNum = 3;
    int sumOfNumbers = 0;
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i+startingNum;
//      for a reverse list:
      numbers[i] = startingNum+numbers.length-i-1;
      System.out.print(" " + numbers[i] + " +");
      sumOfNumbers += numbers[i];
    }
    System.out.println("= " +sumOfNumbers);
  }
}
