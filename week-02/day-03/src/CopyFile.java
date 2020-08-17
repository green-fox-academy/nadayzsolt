import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) {
    System.out.println(copyFile("week-02/-03/assets/my-file.txt", "week-02/day-03/assets/my-file2.txt"));
  }
  public static boolean copyFile(String fromFile, String toFile) {
    boolean isCopySuccessfull = false;
    Path fromFilePath = Paths.get(fromFile);
    Path toFilePath = Paths.get(toFile);
    try {
      List<String> fileContentList = Files.readAllLines(fromFilePath);
      Files.write(toFilePath, fileContentList);
      isCopySuccessfull = true;
    } catch (
        IOException e) {
      System.out.println(e);
    }
    return isCopySuccessfull;
  }
}