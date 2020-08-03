package anagram;
//
//
//    Write a function, that takes two strings and returns a boolean value,
//    based on if the two strings are Anagramms or not.
//     Create a test for that.

//

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
  public static void main(String[] args) {
    String alphaStr = "Bela";
    String betaStr = "Beca";
    anagramCompare(alphaStr, betaStr);
  }

  public static void anagramCompare(String aStr, String bStr) {
    String aLowerStr = aStr.toLowerCase();
    String bLowerStr = bStr.toLowerCase();
    String aSplitStr[] = aStr.split("");
    String bSplitStr[] = bStr.split("");
    List<String> aList = new ArrayList<String>();
    List<String> bList = new ArrayList<String>();

    aList = Arrays.asList(aSplitStr);
    bList = Arrays.asList(bSplitStr);
    boolean aContainsB = aList.containsAll(bList);
    boolean bContainsA = bList.containsAll(aList);

    if (aStr.contentEquals(bStr)) {
      System.out
          .println(aStr + " & " + bStr + " are just the same (it's more then to be anagrams.)");
    } else if (aContainsB == true && bContainsA == true) {
      System.out.println(aStr + " & " + bStr + " are perfect anagrams of each other.");
    } else if (aStr.length() != bStr.length() && aContainsB == true && bContainsA == true) {
      System.out.println(
          aStr + " & " + bStr + " are technically not anagrams, however contain the same letters.");
    } else if (aStr.length() == bStr.length()) {
      System.out.println(aStr + " & " + bStr + " are not anagrams of each other.");
    } else {
      System.out.println(aStr + " & " + bStr + " are not anagrams, not even the same length");
    }
  }
}