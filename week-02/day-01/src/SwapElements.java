import java.util.Arrays;

public class SwapElements {
  public static void main(String[] args) {
    String[] orders = {"first", "second", "third"};
    String tempVar = orders[2];
    orders[2] = orders[0];
    orders[0] = tempVar;
    System.out.println(Arrays.toString(orders));
  }
}
