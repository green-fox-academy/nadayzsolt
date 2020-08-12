package theGardenApplication;

public class Tree extends Plant {
  private double waterLevel = 0.0;
  public double waterLimit = 10.0;
  public double absorption = 0.4;
  public String color;

  public Tree(String color) {
    this.color = color;
  }

  public double getWaterLevel() {
    return waterLevel;
  }

  public void setWaterLevel(double waterLevel) {
    this.waterLevel = waterLevel;
  }

  public double getWaterLimit() {
    return waterLimit;
  }

  public double getAbsorption() {
    return absorption;
  }

  public String getColor() {
    return color;
  }
}
