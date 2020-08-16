package waterable;

public class theApp {

  public static void main(String[] args) {
    MagicalGarden garden = new MagicalGarden();
    garden.addWaterable(new MagicPlant() {
      @Override
      public void water(int waterAmount) {

      }
    });

    garden.water(100);
    garden.reportStatus();
  }
}
