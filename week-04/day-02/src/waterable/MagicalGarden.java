package waterable;

import java.util.ArrayList;
import java.util.List;

public class MagicalGarden {
  List<Waterable> waterables;

  public MagicalGarden() {
    this.waterables = new ArrayList<>();
  }

  public void addWaterable(Waterable waterable) {
    waterables.add(waterable);
  }

  public void water (int waterAmount) {
    for (Waterable waterable: waterables) {
      waterable.water(waterAmount);
    }
  }

  public void reportStatus() {
    for (Waterable waterable: waterables) {
      waterable.reportStatus();
    }
  }
}
