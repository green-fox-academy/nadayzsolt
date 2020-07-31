package sum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumTest {
  public static Sum sum;
  ArrayList<Integer> testList = new ArrayList<>(Arrays.asList(2, 3, 4, 5));
  ArrayList<Integer> testList2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6));

  @BeforeAll
  public static void setup() {
    sum = new Sum();
  }

  @Test
  void getSum() {
    assertEquals(14, sum.addX(testList));
  }

  @Test
  void getSum1() {
    assertTrue(18 == sum.addX(testList2));
  }

  @Test
  void getSum2() {
    assertFalse(9 == sum.addX(testList));
  }
}