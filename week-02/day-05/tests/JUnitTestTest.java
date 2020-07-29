import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class JUnitTestTest {
  @Test
  public void getName() throws Exception {
    JUnitTest test1 = new JUnitTest("test-text");
    assertEquals("test-text", test1.getName());
  }
}
// assertTrue..False..Equals etc codes