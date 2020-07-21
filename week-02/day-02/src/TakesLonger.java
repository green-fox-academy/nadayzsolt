public class TakesLonger {
  public static void main(String[] args) {
    String quote =
        "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    // When saving this quote a disk error has occurred. Please fix it.
    // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
    // Using pieces of the quote variable (instead of just redefining the string)

//  1. replace method
//    quote = quote.replace("It you", "always takes longer than");
//    System.out.println(quote);
//  2. substring method
    int initial = quote.indexOf("y", 0);
    quote = quote.substring(0, initial) + "always takes longer than " + quote.substring(initial);
    System.out.println(quote);
  }
}
