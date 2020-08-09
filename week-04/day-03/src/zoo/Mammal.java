package zoo;

public class Mammal extends Animal{
  String name;
  public Mammal(String koala) {
    this.name = koala;
  }

  public String getName() {
    return name;
  }
  public String breed() {
    return "pushing miniature versions out.";
  }
}
