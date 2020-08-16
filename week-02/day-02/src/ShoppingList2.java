import java.util.HashMap;
import java.util.Map;
import sun.management.snmp.jvminstr.JvmOSImpl;

public class ShoppingList2 {
  static Map<String, Double> priceList;
  static Map<String, Double> shoppingListOfBob;
  static Map<String, Double> shoppingListOfAlice;

  public static void main(String[] args) {
    priceList = new HashMap<>();
    priceList.put("Milk", 1.07);
    priceList.put("Rice", 1.59);
    priceList.put("Eggs", 3.14);
    priceList.put("Cheese", 12.60);
    priceList.put("Chicken Breasts", 9.40);
    priceList.put("Apples", 2.31);
    priceList.put("Tomato", 2.58);
    priceList.put("Potato", 1.75);
    priceList.put("Onion", 1.10);

    shoppingListOfBob = new HashMap<>();
    shoppingListOfBob.put("Milk", 3.0);
    shoppingListOfBob.put("Rice", 2.0);
    shoppingListOfBob.put("Eggs", 2.0);
    shoppingListOfBob.put("Cheese", 1.0);
    shoppingListOfBob.put("Chicken Breasts", 4.0);
    shoppingListOfBob.put("Apples", 1.0);
    shoppingListOfBob.put("Tomato", 2.0);
    shoppingListOfBob.put("Potato", 1.0);

    shoppingListOfAlice = new HashMap<>();
    shoppingListOfAlice.put("Rice", 1.0);
    shoppingListOfAlice.put("Eggs", 5.0);
    shoppingListOfAlice.put("Chicken Breasts", 2.0);
    shoppingListOfAlice.put("Apples", 1.0);
    shoppingListOfAlice.put("Tomato", 10.0);

    double whatBobPays = 0;
    for (Map.Entry price : priceList.entrySet()) {
      for (Map.Entry item : shoppingListOfBob.entrySet()) {
        if (price.getKey() == item.getKey()) {
          whatBobPays += (double) price.getValue() * (double) item.getValue();
        }
      }
    }
    System.out.println("Bob has to pays: " + whatBobPays);

    double whatAlicePays = 0;
    for (Map.Entry price : priceList.entrySet()) {
      for (Map.Entry item : shoppingListOfAlice.entrySet()) {
        if (price.getKey() == item.getKey()) {
          whatAlicePays += (double) price.getValue() * (double) item.getValue();
        }
      }
    }
    System.out.println("Alice has to pays: " + whatAlicePays);

    String particularFood = "Rice";
    String particularFood2 = "Potato";
    compareBoughtAmountOfAParticularFood(particularFood);
    compareBoughtAmountOfAParticularFood(particularFood2);


    if (shoppingListOfBob.size() > shoppingListOfAlice.size()) {
      System.out.println("Bob buys more kind of things.");
    } else if (shoppingListOfBob.size() < shoppingListOfAlice.size()) {
      System.out.println("Alice buys more kind of things.");
    }
    if (shoppingListOfBob.size() == shoppingListOfAlice.size()) {
      System.out.println("Alice & Bob buy the number of kind of different things.");
    }
    compareAmountOfItemsBought();
  }

  public static void compareBoughtAmountOfAParticularFood(String particularFood) {
    if (!(shoppingListOfBob.containsKey(particularFood)) ||
        !(shoppingListOfAlice.containsKey(particularFood))) {
      System.out.println("Incomparable: one or nor of them buys " + particularFood + ".");
    } else if (shoppingListOfAlice.get(particularFood) > shoppingListOfBob.get(particularFood)) {
      System.out.println("Alice buys more " + particularFood + ".");
    } else if (shoppingListOfAlice.get(particularFood) < shoppingListOfBob.get(particularFood)) {
      System.out.println("Bob buys more " + particularFood + ".");
    } else if (shoppingListOfAlice.get(particularFood) == shoppingListOfBob.get(particularFood)) {
      System.out.println("Alice & Bob buys equal amount of " + particularFood + ".");
    }
  }

  public static void compareAmountOfItemsBought() {
    double amountOfItemsBoughtByBob = 0;
    double amountOfItemsBoughtByAlice = 0;
    for (Double amount : shoppingListOfBob.values()) {
      amountOfItemsBoughtByBob += amount;
    }
    for (Double amount : shoppingListOfAlice.values()) {
      amountOfItemsBoughtByAlice += amount;
    }
    if (amountOfItemsBoughtByAlice > amountOfItemsBoughtByBob){
      System.out.println("Alice buys more piece of products than Bob.");
    } else if (amountOfItemsBoughtByAlice < amountOfItemsBoughtByBob){
      System.out.println("Bob buys more piece of products than Alice.");
    } else if (amountOfItemsBoughtByAlice == amountOfItemsBoughtByBob){
      System.out.println("Bob & Alice buy equal piece of products.");
    }
  }
}

