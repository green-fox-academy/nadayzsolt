import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
  public static void main(String[] args) {
    Map<String, String> telephoneBook = new HashMap<String, String>() {{
      put("William A. Lathan", "405-709-1865");
      put("John K. Miller", "402-247-8568");
      put("Hortensia E. Foster", "606-481-6467");
      put("Amanda D. Newland", "319-243-5613");
      put("Brooke P. Askew", "307-687-2982");
    }};
    System.out.println("John K. Miller's number is: " + telephoneBook.get("John K. Miller"));
    for (Map.Entry<String, String> entry : telephoneBook.entrySet()) {
      if (entry.getValue().equals("307-687-2982")) {
        System.out.println(entry.getValue() + " is the number of: " + entry.getKey());
      }
    }
    findIfContainsANumber(telephoneBook, "Chris E. Myers");
  }
  public static void findIfContainsANumber (Map<String, String> telephoneBook, String nameWhoesNumberNeeded) {
    if (telephoneBook.containsKey(nameWhoesNumberNeeded)) {
      System.out.println("Yes, the Telephone Book contains " + nameWhoesNumberNeeded + "'s number.");
    } else {
      System.out.println("No, the Telephone Book does not contain " + nameWhoesNumberNeeded + "'s number.");
    }
  }
}