import java.util.ArrayList;

public class ListIntroduction {
  public static void main(String[] args) {
    ArrayList<String> list1 = new ArrayList <>();
//    System.out.println(list1);
    list1.add("William");
    System.out.println(list1.isEmpty());
    list1.add("John");
    list1.add("Amanda");
    System.out.println(list1);
    System.out.println(list1.size());
    System.out.println(list1.get(2));
    for (int i = 0; i < list1.size(); i++) {
      System.out.println((i+1) + ". " + list1.get(i));
    }

    ArrayList<String> list2 = new ArrayList<String>();
    list2 = new ArrayList<String>(list1);
    System.out.println("list2a: " + list2);

    list1.remove(1);
    System.out.println(list1);
    for (int i = list1.size()-1; i >= list1.size(); i--) {
      System.out.println(list1.get(i));
    }
//    for (int i = list1.size()-1; i >= list1.size(); i--) {
//      System.out.println(list1.get(i));
//    }
    System.out.println("list2b: " + list2);
    list1.removeAll(list2);
    System.out.println("list1" + list1);
    System.out.println("list2c" + list2);
  }
}
