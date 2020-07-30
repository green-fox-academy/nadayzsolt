package anagram;
import java.util.Array.*;

//    Write a function, that takes two strings and returns a boolean value,
//    based on if the two strings are Anagramms or not.
//     Create a test for that.


import java.util.ArrayList;

public class Anagram {
  static String aStr = "bela";
  static String bStr = "abel";
  public static void main(String[] args) {
  char[] aArray = new char[];// initializer?
  char[] bArray = new char[];// initializer?
    aArray = aStr.toCharArray();
    bArray = bStr.toCharArray();
   boolean areTheyAnagram = aArray.equals(bArray);// nem müxik
    System.out.println(areTheyAnagram);
  }


}
