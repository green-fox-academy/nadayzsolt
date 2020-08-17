import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
  public static void main(String[] args) {
    decryptDoubledFile("week-02/day-03/assets/duplicated-chars.txt",
        "week-02/day-03/assets/decrypted-duplicated-chars.txt");
  }

  public static void decryptDoubledFile(String fromFile, String toFile) {
    boolean isDecryptionSuccessfull = false;
    Path fromFilePath = Paths.get(fromFile);
    Path toFilePath = Paths.get(toFile);
    try {
      List<String> fileContentList = Files.readAllLines(fromFilePath);
      List<String> decryptedfileContentList = new ArrayList<>();
      int index = 0;
      String lineContent = "";
      for (String line : fileContentList) {
        for (Character charInLine : line.toCharArray()) {
          ++index;
          if (index % 2 == 0) {
            lineContent += charInLine;
          }
        }
        decryptedfileContentList.add(lineContent);
      }
      Files.write(toFilePath, decryptedfileContentList);
    } catch (
        IOException e) {
      System.out.println(e);
    }
  }
}