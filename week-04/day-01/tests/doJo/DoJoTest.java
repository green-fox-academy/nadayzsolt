package doJo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DoJoTest {

    public static DoJo doJo;
    ArrayList<Character> testDoJoList = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd'));
    String aTestStr = "aaa";
    String bTestStr = "bbb";


    @BeforeAll
    public static void setup() {
        doJo = new DoJo();
    }

    @Test
    void test1() {
        assertEquals(3, doJo.xy(testDoJoList, 'd'));
    }

    @Test
    void test2() {
        assertTrue(doJo.xy(testDoJoList, 'a') == 0);
    }

    @Test
    void test3() {
        assertFalse(doJo.twoStrs("kek", "zold"));
    }

    @Test
    void test4() {
        assertTrue(doJo.twoStrs("kek", "ekk"));
    }

    @Test
    void test5() {
        assertEquals(DoJo.numConvert(199), "százkilencvenkilenc");
    }

}
