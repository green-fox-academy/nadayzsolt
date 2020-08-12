package theGardenApplication;

public class Flower extends Plant {
  double waterLevel = 0.0;
  double waterLimit = 5.0;
  private double absorption = 0.75;
  private String color;

  public Flower(String color) {
    this.color = color;
  }

  public double getWaterLevel() {
    return waterLevel;
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

  public void setWaterLevel(double waterLevel) {
    this.waterLevel = waterLevel;
  }

  public void setWaterLimit(double waterLimit) {
    this.waterLimit = waterLimit;
  }

  public void setAbsorption(double absorption) {
    this.absorption = absorption;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
