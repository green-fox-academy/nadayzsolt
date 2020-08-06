//package apples;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.
//
//public class AppleTest {
//
//  public static Apple apple;
//
//  @BeforeAll
//  public static void setup() {
//    apple = new Apple();
//  }
//
//  //  nem lesz belőle gond, hogy ugyanazt hozzuk létre két helyen @BeforeAll - @BeforeEach?
//  @BeforeEach
//  public void setupEach() {
//    apple = new Apple();
//  }
//
//  @Test
//  void getApple() {
//    assertTrue("eki-eki - eki-eki-bong" == apple.getApple("eki-eki - eki-eki-bong"));
//  }
//
//  @Test
//  void getApple2() {
//    assertFalse("eki-eki - eki-eki-bong" != apple.getApple("eki-eki - eki-eki-bong"));
//  }
//
//  @Test
//  void getApple3() {
//    assertEquals("eki-eki - eki-eki-bong", apple.getApple("eki-eki - eki-eki-bong"));
//  }
//
//}
