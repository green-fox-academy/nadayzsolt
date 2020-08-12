package theGardenApplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Plant> plants;

  public Garden() {
    this.plants = new ArrayList<>();
  }

  public void addPlant(Plant plant) {
    plants.add(plant);
  }

  public void watering(double wateringAmount) {
    double numOfPlantsToBeWatered = 0;
    for (Plant plant : plants) {
      if (plant.getWaterLevel() < plant.getWaterLimit()) {
        ++numOfPlantsToBeWatered;
      }
    }
    double wateringPortion = wateringAmount / numOfPlantsToBeWatered;
    for (Plant plant : plants) {
      if (plant.getWaterLevel() < plant.getWaterLimit()) {
        if (plant.getWaterLimit() >=
            plant.getWaterLevel() + wateringPortion * plant.getAbsorption()) {
          plant.setWaterLevel(plant.getWaterLevel() + wateringPortion * plant.getAbsorption());
        }
      }
    }
    System.out.println(
        "Pouring " + wateringAmount + "l water to " + numOfPlantsToBeWatered +
            " plants & each gets " + wateringPortion + "l");
  }

  public void statusReport() {
    for (Plant plant : plants) {
      if (plant.getWaterLevel() >= plant.getWaterLimit()) {
        System.out.println(
            "The " + plant.getColor() + " " + plant.getClass().getSimpleName() + " doesnt need water");
      } else if (plant.getWaterLevel() < plant.getWaterLimit()) {
        System.out
            .println("The " + plant.getColor() + " " + plant.getClass().getSimpleName() + " need water");
      }
    }
  }
}
