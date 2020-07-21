import java.util.ArrayList;

public class ListIntroduction2 {
  public static void main(String[] args) {
    ArrayList<String> listA = new ArrayList <String>();
    listA.add("Apple");
    listA.add("Avocado");
    listA.add("Blueberries");
    listA.add("Durian");
    listA.add("Lychee");
    ArrayList<String> listB = new ArrayList <String>();
    listB = listA;
    listB.remove("Durian");
    listA.add(3 , "Kiwifruit");
    System.out.println("ListA vs. B:" + listA.equals(listB));
    System.out.println(listA.indexOf("Avocado"));
    System.out.println(listB.indexOf("Durian"));
    listB.add("PassionFruit" + "Pomelo");
    System.out.println(listA.get(2));
    System.out.println("\n" + listA + listB);


  }

}
