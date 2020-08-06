package addNewTask;

public class AddNewTask {
  public static void main(String[] args) {
    for (int i = 1; i < args.length; i++) {
      String theArg = "";
      if (args[0].equals("-a")){
        theArg = theArg + args[i] + " ";
      }
      System.out.println(theArg);
    }
  }
}
