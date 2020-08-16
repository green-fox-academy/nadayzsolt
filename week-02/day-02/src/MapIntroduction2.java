import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIntroduction2 {
  private static Object String;

  public static void main(String[] args) {
    Map<String, String> libraryCatalog = new HashMap<String, String>() {
      {
        put("978-1-60309-452-8", "A Letter to Jo");
        put("978-1-60309-459-7", "Lupus");
        put("978-1-60309-444-3", "Red Panda and Moon Bear");
        put("978-1-60309-461-0", "The Lab");
      }
    };
//    Iterator it = libraryCatalog.values().iterator();
//    Iterator it2 = libraryCatalog.keySet().iterator();
//    while (it.hasNext()) {
//      System.out.print(it.next() + " (ISBN: ");
//      System.out.println(it2.next() + ")");
//    }
    System.out.println("here comes the loop:");
    for (String i : libraryCatalog.keySet()) {
      System.out.println(libraryCatalog.get(i) + " (ISBN: " + i + ")");
    }

    libraryCatalog.remove("978-1-60309-444-3");
    System.out.println("\n" + libraryCatalog + " - after del. - 444-3");
    libraryCatalog.remove(0, "The Lab");
    System.out.println("\n" + libraryCatalog + " - after del. - The Lab");
    libraryCatalog.put("978-1-60309-450-4", "They Called Us Enemy");
    libraryCatalog.put("978-1-60309-453-5", "Why Did We Trust Him?");
    System.out.println(libraryCatalog + " - after adding two books");
    getBookFromCatalog("978-1-60309-453-5", libraryCatalog);
  }

  public static void getBookFromCatalog(String bookNumber, Map libraryCatalog) {
    if (libraryCatalog.get(bookNumber) != null) {
      System.out.println(
          "\n" + "Yes we have the book, and it has a title: " + libraryCatalog.get(bookNumber));
    } else {
      System.out.println("\n" + "no, we do not have such value");
    }
  }
}
