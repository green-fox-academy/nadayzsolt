package implementCharSequence;

import java.util.stream.IntStream;

public class Gnirts implements CharSequence {
  String theStr;

  public Gnirts(String theStr) {
    this.theStr = theStr;
  }


  @Override
  public int length() {
    return theStr.length();
  }

  @Override
  public char charAt(int i) {
    return theStr.charAt(theStr.length()-i-1);
  }

  @Override
  public CharSequence subSequence(int i, int i1) {
    String rev = "";
    for(int j=theStr.length()-1;j>=0;j--)
      rev = rev+theStr.charAt(j);
    return rev.subSequence(i, i1);
  }

  @Override
  public IntStream chars() {
    return theStr.chars();
  }

  @Override
  public IntStream codePoints() {
    return theStr.codePoints();
  }
}

