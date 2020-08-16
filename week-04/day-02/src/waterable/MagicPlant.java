package waterable;

public abstract class MagicPlant implements Waterable {
  public int height;

  public abstract void water(int waterAmount);

  public void reportStatus() {
    System.out.println("I am a plant & I am " + height + " tall.");
  }
}
