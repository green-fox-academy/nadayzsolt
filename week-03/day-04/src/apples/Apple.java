package apples;

public class Apple {
  static String apple = null;

  public static void main(String[] args) {

    getApple("blablabla & lárifári");
    System.out.println(getApple("blablabla & lárifári"));
    System.out.println(apple);
  }

  public static String getApple(String notApple) {

    return apple = notApple;
  }
}
