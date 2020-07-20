// - Create an array variable named `numList`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array

import java.util.Arrays;

public class DoubleItems {
  public static void main(String[] args) {

    // 1. the better solution:
    {
      int[] numList = {3, 4, 5, 6, 7};
      for (int i = 0; i < numList.length; i++) {
        numList[i] = numList[i] * 2;
      }
      System.out.println(Arrays.toString(numList));
      System.out.println("\n");
    }

// 2. the worst solution:
    {
      int[] numList = {3, 4, 5, 6, 7};
      int numList2[] = new int[numList.length];

      for (int i = 0; i < numList.length; i++) {
        numList2[i] = numList[i] * 2;
      }
      numList = numList2;
      System.out.println(Arrays.toString(numList));
    }
  }
}
