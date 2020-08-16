// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output


import java.util.Scanner;

public class DiagonalMatrix {
  public static void main(String[] args) {
    System.out.print("Add number n which represents the size of an n*n matrix: ");
    Scanner scanner = new Scanner(System.in);
    int multiArrayLength = scanner.nextInt();

    int[][] multiArray = new int[multiArrayLength][multiArrayLength];
//    int[][] multiArray = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};

    for (int i = 0; i < multiArrayLength; i++) {
      for (int j = 0; j < multiArrayLength; j++) {
        if (i == j) {
          multiArray[i][j] = 1;
//          If want invert it:
//          multiArray[i][multiArrayLength - j - 1] = 1;
//          multiArray[multiArrayLength - i - 1][j] = 1;
        } // else pointless, since the initialized but not added values are by default "0";
      }
    }
//    now make a


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
//        } else {
//          System.out.print("0 ");
//        }
//        if (i == j) {
//          System.out.print(i + "*" + j + " ");
//        } else {
//          System.out.print(i + " " + j + " ");
    }
  }
