import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    scan.close();
    printPermutations(str, "");

  }

  public static void printPermutations(String str, String asf) {

    if (str.length() == 0) {
      System.out.println(asf);
    }

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      String strLeft = str.substring(0, i);
      String strRight = str.substring(i + 1);
      String restOfStr = strLeft + strRight;
      printPermutations(restOfStr, asf + ch);
    }
  }

}