package zoo;

public class Bird extends Animal{
  String name;
  public Bird(String parrot) {
    this.name = parrot;
  }
//birds lay eggs to breed() - whatever does it can mean now...

  public String getName() {
    return name;
  }

  public String breed(){
    return "laying eggs";
  }

}
