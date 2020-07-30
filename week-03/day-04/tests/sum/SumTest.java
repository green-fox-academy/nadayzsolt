package sum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumTest {
  public static Sum sum;

  @BeforeAll
  public static void setup() {
    sum = new Sum();
  }

// Ha ezt beírom, akkor ignorálja a teszteket:
//  @BeforeEach
//  public static void setupEach() {
//    sum = new Sum();
//  }

  @Test
  void getSum() {
    assertEquals(9, sum.add(4, 5));
  }

  @Test
  void getSum1() {
    assertTrue(9 == sum.add(4, 5));
  }

  @Test
  void getSum2() {
    assertFalse(9 != sum.add(4, 5));
  }
}
