import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class practice {
  public static void main(String[] args) {
//    String foos = "Foo1,Foo2,Foo3";
//    String [] fooArray = foos.split(",");  // now you have an array of 3 strings
//    String bela = Arrays.toString(fooArray);
//    foos = String.join(",", fooArray);
//    System.out.println(bela);
//    for (String foo: fooArray) {
//      System.out.println(foo);
//    double multi[][] = { {1.0, 2.0}, {2.11, 204.00, 11.00, 34.00},{66.5,43.3,189.6}};
//    double single [] = {1.0, 2.0, 2.11, 204.00, 11.0, 66.5,43.3,189.6};
//    int n = 0;
//    for (double[] elt : multi) {
//      n += elt.length;
//    }
//    double[] single = new double[n];
//    n = 0;
//    for (double[] elt : multi) {
//      System.arraycopy(elt, 0, single, n, elt.length);
//      n += elt.length;
//    }
//    for (double num: single) {
//      System.out.println(num);
//    }
//    String[] fooArray = {"Foo1","Foo2","Foo3"};
//    String foos = String.join(",", fooArray); //
//    System.out.println(foos);
//    String[] tempArrayLines = {"112", "123", "5455"};
//    List<String> lines = new ArrayList<>(Arrays.asList(tempArrayLines));
//    int sum = 0;
//    for (String line : lines) {
//      sum += Integer.parseInt(line);
//    }
    char bela = 'b';
    Character belaCharacter = bela;
    String myString = belaCharacter.toString();
    System.out.println(myString);
  }
}