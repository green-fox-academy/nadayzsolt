//package randomThing;
//
//
//// https://data-flair.training/blogs/file-handling-in-java/
//
//import java.io.File;
//import java.nio.charset.StandardCharsets;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class RandomThing {
//  static String fileName = "countchar.txt";
//  static String fileIO = "";
//  static String newString = "";
//
//  public static void main(String[] args) {
//
//    String filePath = "week-03\\day-05\\src\\randomThing\\countchar.txt";
//    fileIO(fileName, filePath);
//    charCounter(newString);
//  }
//
//  public static String fileIO(String fileName, String filePath) {
//    try {
//      Path path = Paths.get(filePath);
//      List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
//      System.out.println(lines.get(0));
//      String newString = lines.toString();
////      System.out.println(newString);
//    } catch (Exception e) {
//      System.out.println("Uh-oh, could not read the file!");
//    }
//    return newString;
//  }
//
//  public static void charCounter(String fileString) {
//    String lowerCaseStr = fileString.toLowerCase();
//    String aSplitStr[] = lowerCaseStr.split("");
//    List<String> theList = new ArrayList<String>();
//    theList = Arrays.asList(aSplitStr);
//    System.out.println(theList.sort(a));
//
//    for(int i = 0; i<theList.size()-1; i++) {
//      for (int j = i+1; j<theList.size(); j++) {
//        if(theList[i].compareTo(theList[j])>0) {
//          String temp = theList[i];
//          theList[i] = theList[j];
//          myArray[j] = temp;
//
////    theList.sort();
//
////    for (int i  = 0; i  < theList.size(); i ++) {
//
//
//  }
//
//}