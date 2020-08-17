import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
  public static void main(String[] args) {
    decryptReversedLineOrder("week-02/day-03/assets/reversed-order.txt",
        "week-02/day-03/assets/decrypted-reversed-order.txt");
  }

  public static void decryptReversedLineOrder(String fromFile, String toFile) {
    boolean isDecryptionSuccessfull = false;
    Path fromFilePath = Paths.get(fromFile);
    Path toFilePath = Paths.get(toFile);
    try {
      List<String> fileContentList = Files.readAllLines(fromFilePath);
      List<String> decryptedfileContentList = new ArrayList<>();
        for (int i = fileContentList.size() - 1; 0 <= i; i--) {
        decryptedfileContentList.add(fileContentList.get(i));
      }
      Files.write(toFilePath, decryptedfileContentList);
    } catch (
        IOException e) {
      System.out.println(e);
    }
  }
}