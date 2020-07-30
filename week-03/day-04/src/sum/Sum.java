package sum;

import java.util.ArrayList;
import java.util.Arrays;

public class Sum {

  public static void main(String[] args) {
    ArrayList<Integer> sanyiList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    System.out.println(addX(sanyiList));
    for (int i = 0; i < 4; i++) {
      int randomX = (int) (Math.random() * 100);
      sanyiList.add(randomX);
    }
    System.out.println(sanyiList.size());
    System.out.println(addX(sanyiList));
  }

  public static int addX(ArrayList<Integer> inputList) {
    int sum = 0;
    for (Integer bela : inputList) {
      sum += bela;
    }
    return sum;
  }
}