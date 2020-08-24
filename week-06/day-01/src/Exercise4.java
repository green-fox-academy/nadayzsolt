import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleFunction;

public class Exercise4 {
  public static void main(String[] args) {
//    Write a Stream Expression to get the average value of the odd numbers from the following list:
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    double averageNum = numbers.stream()
        .filter(num -> num % 2 != 0)
        .mapToDouble(Double::valueOf)
//      .mapToInt(num -> num)
        .average()
        .orElse(0);
//        csak akkor működik, ha streamben marad:
//      .ifPresent(System.out::println);

    System.out.println(averageNum);
  }
}
