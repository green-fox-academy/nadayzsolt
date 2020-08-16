import java.util.ArrayList;
import java.util.List;

public class PersonalFinance {
  public static void main(String[] args) {
    List<Double> expenses = new ArrayList<>();
    double[] expensesTempArray = {500, 1000, 1250, 175, 800, 120};
    for (double num : expensesTempArray) {
      expenses.add(num);
    }
    double sum = 0;
    System.out.println(expenses + "\n");
    for (Double expense : expenses) {
      sum += expense;
    }
    System.out.println("The sum: " + sum);

    double greatestExpense = 0;
    for (Double expense : expenses) {
      if (expense > greatestExpense) {
        greatestExpense = expense;
      }
    }
    double cheapestSpending = greatestExpense;
    for (Double expense : expenses) {
      if (expense < cheapestSpending) {
        cheapestSpending = expense;
      }
    }
    System.out.println("The greatest expense: " + greatestExpense);
    System.out.println("The cheapest spending: " + cheapestSpending);
    System.out.println("The average amount of spendings: " + (double)(sum / expenses.size()));
  }
}