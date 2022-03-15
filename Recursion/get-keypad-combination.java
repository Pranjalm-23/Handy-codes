import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    ArrayList<String> words = getKPC(str);
    System.out.println(words);
  }

  static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz",};
  public static ArrayList<String> getKPC(String str) {

    if (str.length() == 0) {
      ArrayList<String> baseResult = new ArrayList<>();
      baseResult.add("");
      return baseResult;
    }

    char ch = str.charAt(0);
    String restOfString = str.substring(1);

    ArrayList<String> recResult = getKPC(restOfString);
    ArrayList<String> myResult = new ArrayList<>();

    String codeForCh = codes[ch - 48]; // to convert to the real integer value from ascii (48 = 'a')
    for (int i = 0; i < codeForCh.length(); i++) {
      char chCode = codeForCh.charAt(i);
      for (String rstr : recResult) {
        myResult.add(chCode + rstr);
      }
    }
    return myResult;

  }

}