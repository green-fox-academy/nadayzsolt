import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDatabase2 {
  public static void main(String[] args) {
    Map<String, Integer> priceList = new HashMap<String, Integer>();
    priceList.put("Eggs", 200);
    priceList.put("Milk", 200);
    priceList.put("Fish", 400);
    priceList.put("Apples", 150);
    priceList.put("Bread", 50);
    priceList.put("Chicken", 550);

    List<String> productsUnder201 = new ArrayList<>();
    for (Map.Entry entry : priceList.entrySet()) {
      if ((int) entry.getValue() < 201) {
        productsUnder201.add((String) entry.getKey());
      }
    }
    System.out.println(productsUnder201);
    Map<String, Integer> productAbove150 = new HashMap<>();
    for (Map.Entry entry : priceList.entrySet()) {
      if ((int) entry.getValue() > 150) {
        productAbove150.put((String)entry.getKey(), (Integer)entry.getValue());
      }
    }
    System.out.println(productAbove150);
  }
}