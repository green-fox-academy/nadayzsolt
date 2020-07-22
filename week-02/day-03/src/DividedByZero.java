// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

import java.util.Scanner;

public class DividedByZero {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int divisor = scanner.nextInt();

    printDivision(divisor);


  }
//  A void azért van, mert nincs a függvénynek kimeneti értéke, lehetne pl. String, vagy Integer is
//  Ami még fontos, hogy a printDivision a neve függvénynek és egyedül ez az amit felismer a main
//  Amiatt teljesen mindegy, hogy mi függvényen belüli változó neve, mivel annak nem kell megegyeznie
//  a mainben lévő, első ránézésre ugyanazt jelölő változóval.
//  A függvény deklarálásának a mainen kívül kell megtörténnie, így a main {}-ének lezárulta után
//  a deklarálás alatt lehet és kell csak beírni a függvény tartalmát. A mainbe csak a függvény
//  meghívása kerül(a zárójelben lévő bemeneti értékét pedig ott a függvényben lévőtől függetlenül,
//  azt megelőzően is deklarálni kell. Ez a deklarálás a main-ben, mivel a függvény meghívását követő
//  értéknek először meg kell képződnie, ezért a függvény meghívása előtt kell legyen deklarálva is,
//  ebből következik, hogy ott a zárójelen belül már nem kerül jelölésre a típusa, ezzel szemben a
//  a függvény deklarálása során a zárójelbe már be kell, hogy kerüljön (a függvényen belüli változó),
//  mivel itt ez az első megjelenési formája, így itt a zárójelen belül kerül deklarálásra.
//  A függvény nem statement így annak a végére, nem kerül ";"!!!
//
//  Szóval a try-catch-finally meg abban van, hogy amit a úgy írtam volna le, hogy:
//public static void printDivision(Integer divisor2) {
//    int result = 10 / divisor2;
//    System.out.println(result);
//  }
//  - annak a közepébe belandol egy "try" ez az amire rápróbálunk, és ha nagyon nem adja, akkor
//  nem végzi el, hanem átmegy akár egy "if else" az Exception típusú "e" névű változóba, és ha az már
//  és az végzi el a saját műveletét, de a "finally" mindenképp ki lesz nyomtatva.

  public static void printDivision(Integer divisor2) {
    try {
      int result = 10 / divisor2;
      System.out.println(result);
    } catch (Exception e){
      System.out.println("vmi nem ok");
    } finally {
      System.out.println("nagyon megy :)))))");
    }
  }
}

