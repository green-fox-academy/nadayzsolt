package dominoes;

import java.util.ArrayList;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...


//    This is a partial solution Copyrights: aurelreli -
//    but his solution wt the var "motva" is unbelivable for me, this is why I didn't copied it.
//    System.out.println(dominoes);
    for (int i = 0; i < dominoes.size(); i++) {
      for (int j = 0; j < dominoes.size(); j++) {
        if ((dominoes.get(i).getRightSide()) == (dominoes.get(j).getLeftSide())) {
          System.out.print(dominoes.get(i));
          System.out.print(dominoes.get(j));
        }
      }
    }
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}