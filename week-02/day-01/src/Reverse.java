public class Reverse {
  public static void main(String[] args) {
    int[] numbers = {3, 4, 5, 6, 7};
//    int[] tempNumbers = {3, 4, 5, 6, 7}; // or initialize & for loop copy:
    int[] tempNumbers = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      tempNumbers[i] = numbers[i];
    }
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = tempNumbers[tempNumbers.length - i - 1];
      System.out.println(numbers[i]);
    }
  }
}