package flyable;

public class Bird extends Vehicle {
  String name;
  public Bird(String parrot) {
    this.name = parrot;
  }

  public String getName() {
    return name;
  }

  public String breed(){
    return "laying eggs";
  }

}
