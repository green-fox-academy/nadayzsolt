// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output


public class DiagonalMatrix {
  public static void main(String[] args) {
    int[][] multiArray = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};

    // 1. the solution with the multidimensional array on the normal(fori) way:
    for (int i = 0; i < multiArray.length; i++) {
      System.out.println("");
      for (int j = 0; j < multiArray[i].length; j++) {
        System.out.print(multiArray[i][j] + " ");

      }
    }
      System.out.println("\n");


// 2. Solution with the the enhanced/dynamic for (foreach):
    for (int[] rowPlaceholder : multiArray) {
      for (int columnPlaceholder : rowPlaceholder) {
        System.out.print(columnPlaceholder + " ");
      }
      System.out.println("");
    }


//    Solution without "The Matrix":
//    for (int i = 0; i < 4; i++) {
//      System.out.println("");
//      for (int j = 0; j < 4; j++) {
//        if (i == j) {
//          System.out.print("1 ");
//
//        } else {
//          System.out.print("0 ");
//        }
//        if (i == j) {
//          System.out.print(i + "*" + j + " ");
//
//        } else {
//          System.out.print(i + " " + j + " ");
  }
}
