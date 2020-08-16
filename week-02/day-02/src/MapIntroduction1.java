import java.security.Key;
import java.util.HashMap;

public class MapIntroduction1 {
  private static Object Integer;
  private static java.lang.Object Object;

  public static void main(String[] args) {
    HashMap<Integer, Character> myLittleMap = new HashMap<Integer, Character>();
    System.out.println(myLittleMap.isEmpty());
    myLittleMap.put(97, 'a');
    myLittleMap.put(98, 'b');
    myLittleMap.put(99, 'c');
    myLittleMap.put(65, 'A');
    myLittleMap.put(66, 'B');
    myLittleMap.put(67, 'C');
    System.out.println(myLittleMap.keySet());
    System.out.println(myLittleMap.values());
    myLittleMap.put(68, 'D');

    System.out.println("\n" + myLittleMap);
    System.out.println(myLittleMap.size());
    System.out.println(myLittleMap.get(99));
    System.out.println(myLittleMap.get(97));
    System.out.println(myLittleMap.get(100));
    myLittleMap.clear();
//    System.out.println(myLittleMap.isEmpty());
    System.out.println(myLittleMap);
  }
}
