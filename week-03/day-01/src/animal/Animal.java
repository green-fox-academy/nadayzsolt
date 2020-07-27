package animal;

public class Animal {
    //  lehet így is, csak ne így:
    //  private int hunger = 50;
//  private int thirst = 50;
    private int hunger;
    private int thirst;

    public Animal() {
        this.hunger = 50;
        this.thirst = 50;
    }

    public void eat() {
        if (hunger > 0) {
            --hunger;
            System.out.println("ham-ham");
        } else {
            System.out.println("A libatömés megannyi országban tilos és állattalan, tegyen ön is ellene, azzal hogy nem eteti túl libáját! Köszönjük");
        }
    }

    public void drink() {
        if (thirst > 0) {
            --thirst;
            System.out.println("Köszönjük, hogy libája szervezetét gyakori itatással revitalizálja!");
        } else {
            System.out.println("Ha csak nincs valami tömény, elég lesz, mert megfullad az állat!");
        }
    }
public void play() {
        ++thirst;
        ++hunger;
            System.out.println("Köszönjük, hogy játszik állatával! (Madárinfluenza esetén nem javasolt!)");
    }

}