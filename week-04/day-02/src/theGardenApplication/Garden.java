//package theGardenApplication;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Garden {
//  List<Flower> flowers;
//  List<Tree> trees;
//
//  public Garden() {
//    this.flowers = new ArrayList<>();
//    this.trees = new ArrayList<>();
//  }
//
//  public void addFlower(Flower flower) {
//    flowers.add(flower);
//  }
//
//  public void addTree(Tree tree) {
//    trees.add(tree);
//  }
//  public void watering(double wateringAmount) {
//    double numOfPlantsToBeWatered = 0;
//    if (flower.getWaterLevel() < flower.getWaterLimit()) {
//      numOfPlantsToBeWatered += flowers.size();
//    }
//    if (tree.getWaterLevel() < tree.getWaterLimit()) {
//      numOfPlantsToBeWatered += trees.size();
//    }
//    double wateringPortion = wateringAmount / numOfPlantsToBeWatered;
//    if (flower.getWaterLevel() < flower.getWaterLimit()) {
//      if (flower.getWaterLimit() >= flower.getWaterLevel() + wateringPortion * flower.getAbsorption()) {
//        flower.setWaterLevel(flower.getWaterLevel() + wateringPortion * flower.getAbsorption());
//      }
//    }
//    if (tree.getWaterLevel() < tree.getWaterLimit()) {
//      if (tree.getWaterLimit() >= tree.getWaterLevel() + wateringPortion * tree.getAbsorption()) {
//        tree.setWaterLevel(tree.getWaterLevel() + wateringPortion * tree.getAbsorption());
//      }
//    }
//    System.out.println(
//        "Pouring " + wateringAmount + "l water to " + numOfPlantsToBeWatered + " plants & each gets " + wateringPortion + "l");
//  }
//
//  public void statusReport() {
//    if (flower.getWaterLevel() >= flower.getWaterLimit()) {
//      System.out.println("The " + flower.getColor() + flower.getClass() + " doesnt need water");
//    } else if (flower.getWaterLevel() < flower.getWaterLimit()) {
//      System.out.println("The " + flower.getColor() + flower.getClass() + " need water");
//    }
//    if (tree.getWaterLevel() >= tree.getWaterLimit()) {
//      System.out.println("The " + tree.getColor() + tree.getClass() + " doesnt need water");
//    } else if (tree.getWaterLevel() < tree.getWaterLimit()) {
//      System.out.println("The " + tree.getColor() + tree.getClass() + " need water");
//    }
//  }
//}
