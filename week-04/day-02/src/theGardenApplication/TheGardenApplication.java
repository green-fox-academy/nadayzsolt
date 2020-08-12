package theGardenApplication;

import java.util.ArrayList;
import java.util.List;

public class TheGardenApplication {

  public static void main(String[] args) {
    Garden garden = new Garden();
    List<Plant> plants = new ArrayList<>();
    Flower blueFlower = new Flower("blue");
    Flower yellowFlower = new Flower("yellow");
    Tree purpleTree = new Tree ("purple");
    Tree orangeTree = new Tree ("orange");


    garden.addPlant(blueFlower);
    garden.addPlant(yellowFlower);
    garden.addPlant(purpleTree);
    garden.addPlant(orangeTree);

    garden.statusReport();
    garden.watering(40);
    garden.statusReport();
//    garden.watering(70);
//    garden.statusReport();
  }
}
