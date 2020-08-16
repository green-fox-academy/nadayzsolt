package theGardenApplication;

public class Flower extends Plant {
  private double waterLevel = 0.0;
  private double waterLimit = 5.0;
  private double absorption = 0.75;
  private String color;

  public Flower(String color) {
    this.color = color;
  }

  protected Flower() {
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
