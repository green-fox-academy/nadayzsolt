package theGardenApplication;

public class Tree {
  private double waterLevel = 0;
  public double waterLimit = 10;
  public double absorption = 2/5;
  private String color;

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

  public void setWaterLimit(double waterLimit) {
    this.waterLimit = waterLimit;
  }

  public double getAbsorption() {
    return absorption;
  }

  public void setAbsorption(double absorption) {
    this.absorption = absorption;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
