import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
  public static void main(String[] args) {
    Map<String, Integer> priceList = new HashMap<String, Integer>() {
      {
        put("Eggs", 200);
        put("Milk", 200);
        put("Fish", 400);
        put("Apples", 150);
        put("Bread", 50);
        put("Chicken", 550);
      }
    };
    System.out.println(priceList.get("Fish"));

    String mostExpensiveProduct = "";
    int mostExpensivePrice = 0;
    for (Map.Entry entry : priceList.entrySet()) {
      if (mostExpensivePrice < (int) entry.getValue()) {
        mostExpensivePrice = (int) entry.getValue();
        mostExpensiveProduct = (String) entry.getKey();
      }
    }
    int sumOfPrices = 0;
//    commented out: how to create one String from keys:
//    String allTheKeys = "";
    System.out.println(mostExpensiveProduct);
    for (int price : priceList.values()) {
//    for (String key : priceList.keySet()) {
      sumOfPrices += price;
//      allTheKeys += key + " ";
    }
//    System.out.println(allTheKeys);
    System.out.println("The average price is : " + sumOfPrices / priceList.size());
    int pricesBelove300 = 0;
    for (int price : priceList.values()) {
      if (price < 300) {
        ++pricesBelove300;
      }
    }
    System.out.println(pricesBelove300 + " of the products has price under 300.");

    int exactPrice = 125;
    if (priceList.values().contains(exactPrice)) {
      System.out.println("Yes, there is a product for " + exactPrice + ".");
    } else {
      System.out.println("No, there is no product for " + exactPrice + ".");
    }

    int cheapestPrice = mostExpensivePrice;
String cheapestProduct = "";
    for (Map.Entry entry: priceList.entrySet()) {
      if (cheapestPrice > (int)entry.getValue()) {
        cheapestPrice = (int)entry.getValue();
        cheapestProduct = (String)entry.getKey();
      }
    }
    System.out.println(cheapestProduct + " is the cheapest product for " + cheapestPrice + ".");
  }
}
