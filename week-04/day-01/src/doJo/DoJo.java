package doJo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoJo {

    public static String xUnoStr = "";
    public static String xDecimalStr = "";
    public static String xHectoStr = "";
    public static String xKiloStr = "";

    public static String x100Str = "száz";
    public static String x1000Str = "ezer";

    public static String x1Str = "egy";
    public static String x2Str = "kettő";
    public static String x3Str = "három";
    public static String x4Str = "négy";
    public static String x5Str = "öt";
    public static String x6Str = "hat";
    public static String x7Str = "hét";
    public static String x8Str = "nyolc";
    public static String x9Str = "kilenc";

    public static String x10Str = "tíz";
    public static String x20Str = "húsz";
    public static String x30Str = "harminc";
    public static String x40Str = "negyven";
    public static String x50Str = "ötven";
    public static String x60Str = "hatvan";
    public static String x70Str = "hetven";
    public static String x80Str = "nyolcvan";
    public static String x90Str = "kilencven";


    public static void main(String[] args) {
        System.out.println(numConvert(199));
    }

    public int xy(ArrayList<Character> doJoList, Character theChar) {
        return doJoList.indexOf(theChar);
    }

    public boolean twoStrs(String a, String b) {
        char[] charStrA = a.toCharArray();
        char[] charStrB = b.toCharArray();
        Arrays.sort(charStrA);
        Arrays.sort(charStrB);
        return Arrays.equals(charStrA, charStrB);
    }
    @Test
    void test5() {
        assertEquals(DoJo.numConvert(199), "százkilencvenkilenc");
    }
    public static String numConvert(int amount) {
        String vmi = String.valueOf(amount);

        if (amount > 99) {
            xHectoStr = x100Str;
        }
        if (vmi.charAt(1) == '1') {
            xDecimalStr = x10Str;
        } else if (vmi.charAt(1) == '2') {
            xDecimalStr = x20Str;
        } else if (vmi.charAt(1) == '3') {
            xDecimalStr = x30Str;
        } else if (vmi.charAt(1) == '4') {
            xDecimalStr = x40Str;
        } else if (vmi.charAt(1) == '5') {
            xDecimalStr = x50Str;
        } else if (vmi.charAt(1) == '6') {
            xDecimalStr = x60Str;
        } else if (vmi.charAt(1) == '7') {
            xDecimalStr = x70Str;
        } else if (vmi.charAt(1) == '8') {
            xDecimalStr = x80Str;
        } else if (vmi.charAt(1) == '9') {
            xDecimalStr = x90Str;
        }

        if (vmi.charAt(2) == '1') {
            xUnoStr = x1Str;
        } else if (vmi.charAt(2) == '2') {
            xUnoStr = x2Str;
        } else if (vmi.charAt(2) == '3') {
            xUnoStr = x3Str;
        } else if (vmi.charAt(2) == '4') {
            xUnoStr = x4Str;
        } else if (vmi.charAt(2) == '5') {
            xUnoStr = x5Str;
        } else if (vmi.charAt(2) == '6') {
            xUnoStr = x6Str;
        } else if (vmi.charAt(2) == '7') {
            xUnoStr = x7Str;
        } else if (vmi.charAt(2) == '8') {
            xUnoStr = x8Str;
        } else if (vmi.charAt(2) == '9') {
            xUnoStr = x9Str;
        }
        return xHectoStr + xDecimalStr + xUnoStr;
    }
}
