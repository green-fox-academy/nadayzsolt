import java.util.Formatter;

public class TodoPrint {
  public static void main(String[] args) {

    String todoText = " - Buy milk\n";

    // Add "My todo:" to the beginning of the todoText
    // Add " - Download games" to the end of the todoText
    // Add " - Diablo" to the end of the todoText but with indention

    // Expected output:

    // My todo:
    //  - Buy milk
    //  - Download games
    //      - Diablo

    String my = "My todo:";
    String games = " - Download games";
    String newLine = "\n";
    String diablo = " - Diablo";
    String myIntendedIndentation = "    ";
    todoText = my.concat(newLine).concat(todoText).concat(games).concat(newLine).concat(myIntendedIndentation).concat(diablo);

    System.out.println(todoText);
  }
}
