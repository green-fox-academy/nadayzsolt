import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingList {
  public static void main(String[] args) {
    List<String> shoppingList = new ArrayList<>();
    String[] shoppingListTempArray = {"eggs", "milk", "apples", "bread", "chicken"};
    shoppingList.addAll(Arrays.asList(shoppingListTempArray));
    findItemsInList(shoppingList, "milk");
    findItemsInList(shoppingList, "bananas");
  }
    public static void findItemsInList (List <String> shoppingList, String itemToFind){
    System.out.println("It is " + shoppingList.contains(itemToFind) + ", that the list contains " + itemToFind + ".");
  }
}
