package zoo;

public class Reptile extends Animal{
  String name;
  public Reptile(String crocodile) {
    this.name = crocodile;
  }

  public String getName() {
    return name;
  }


  public String breed(){
    return "laying eggs";
  }
}
