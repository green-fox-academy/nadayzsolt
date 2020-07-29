package strings;

// Given a string, compute recursively (no loops) a new string where:
// all the lowercase 'x' chars have been changed to 'y' chars.

public class Strings {
    public static void main(String[] args) {
        String theVeryStr = "xsdlfkjnerklgjnfihxxxxxxdpfweé";
        System.out.println(theMakerOfStr(theVeryStr));
    }

    public static String theMakerOfStr(String oldStr) {
        if (oldStr.length() == 0) {
            return oldStr;
        } else {
            if (oldStr.charAt(0) == 'x') {
                return 'y' + theMakerOfStr(oldStr.substring(1));
            } else {
                return oldStr.charAt(0) + theMakerOfStr(oldStr.substring(1));
            }

//    This would be the normal solution without recursion, that's not the situation.
//           The upper solution follows aurelreli's & menyhartkyra's solutions.
//        String x = "x";
//        if (oldStr.contains("x")) {
//            return oldStr.replace("x", "y");
//        } else {
//            return oldStr;
//        }
        }
    }
}