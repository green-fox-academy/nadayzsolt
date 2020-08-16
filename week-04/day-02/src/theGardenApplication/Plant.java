package theGardenApplication;

public abstract class Plant {
  private double waterLevel;
  private double waterLimit;
  private double absorption;
  private String color;

  public Plant(String color) { this.color = color; }

  protected Plant() {
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
