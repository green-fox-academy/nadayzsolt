package zoo;

public abstract class Animal {
  public String name;
  public int age;
public String sex;

  public String getName() {
    return name;
  }

  public abstract String breed();
}
