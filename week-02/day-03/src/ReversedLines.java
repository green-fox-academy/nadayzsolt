import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
  public static void main(String[] args) {
    decryptReversedFile("week-02/day-03/assets/reversed-lines.txt",
        "week-02/day-03/assets/decrypted-reversed-lines.txt");
  }

  public static void decryptReversedFile(String fromFile, String toFile) {
    boolean isDecryptionSuccessfull = false;
    Path fromFilePath = Paths.get(fromFile);
    Path toFilePath = Paths.get(toFile);
    try {
      List<String> fileContentList = Files.readAllLines(fromFilePath);
      List<String> decryptedfileContentList = new ArrayList<>();
      String lineContent = "";
      for (String line : fileContentList) {
        for (int i = line.length() - 1; 0 <= i; i--) {
          lineContent += line.charAt(i);
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