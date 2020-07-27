package sharpie;

//- Create `Sharpie` class
//  - We should know about each sharpie their `color` (which should be a string),
//          `width` (which will be a floating point number), `inkAmount` (another
//          floating point number)
//          - When creating one, we need to specify the `color` and the `width`
//          - Every sharpie is created with a default 100 as `inkAmount`
//        - We can `use()` the sharpie objects
//        - which decreases inkAmount

public class Main {
    public static void main(String[] args) {
        Sharpie sharpie1 = new Sharpie("BLUE", 21.1f);
        System.out.println(sharpie1.getInkAmount());
        for (int i = 0; i < 101; i++) {
            sharpie1.use();
        }
        System.out.println(sharpie1.getInkAmount());
    }
}
