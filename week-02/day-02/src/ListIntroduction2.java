import java.util.ArrayList;
import java.util.List;

public class ListIntroduction2 {
  public static void main(String[] args) {
    List<String> listA = new ArrayList<>();
    listA.add("Apple");
    listA.add("Avocado");
    listA.add( 0, "Blueberries");
    listA.add("Durian");
    listA.add(1, "Lychee");
    System.out.println(listA);
//    ArrayList<String> listB = new ArrayList<String>();
//    for (String fruit: listA) {
//      listB.add(fruit);
//    }
//    System.out.println("lets see: " + listB);
//    listB.remove("Durian");
//    listA.add(3, "Kiwifruit");
//    System.out.println("listA = listB:" + listA.equals(listB));
//    System.out.println(listA.indexOf("Avocado"));
//    System.out.println(listB.indexOf("Durian"));
//    System.out.println("\n" + listA + "\n" + listB);
//    listB.add("PassionFruit" + "Pomelo");
//    System.out.println(listA.get(2));
//    System.out.println("\n" + listA + "\n" + listB);
  }
}
