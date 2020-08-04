package theGardenApplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  private List<Flower> flowers;
  private List<Tree> trees;
  Flower flower = new Flower();
Tree tree = new Tree();

  public void addFlower(Flower flower) {
    flowers.add(flower);
  }

  public void addTree (Tree tree){
    trees.add(tree);
  }

    public Garden() {
      this.flowers = new ArrayList<>();
      this.trees = new ArrayList<>();
    }

    public void watering (int wateringAmount){
      int segedValtozo = flowers.size() + trees.size();
      if (flower.getWaterLevel() >= 5 && tree.getWaterLevel() >= 10 {segedValtozo = segedValtozo - flowers.size()}
      else
      for (int i = 1; i < segedValtozo; i++) {
       if (wateringAmount / segedValtozo <= 10 && waterLevel) {
         trees.getwaterLevel
       }
      }
    }


  }
