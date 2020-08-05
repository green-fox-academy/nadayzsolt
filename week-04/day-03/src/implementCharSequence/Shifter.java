package implementCharSequence;

public class Shifter {
  public static void main(String[] args) {


    Gnirts gnirts = new Gnirts("the example");

    System.out.println(gnirts.length());
    System.out.println(gnirts.charAt(2));
    System.out.println(gnirts.subSequence(2, 6));
    System.out.println(gnirts.chars());
    System.out.println(gnirts.codePoints());


  }
}
