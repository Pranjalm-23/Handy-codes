import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scan = new Scanner(System.in);
      String str = scan.next();
      printKPC(str, "");
    // we are not storing the values found in memory instead we are just printing them when reached base case;
    }

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz",};
    public static void printKPC(String str, String ans) {
      if(str.length()==0){
        System.out.println(ans);
        return;
      }
      //678===str
        char ch = str.charAt(0); //6
        String restOfString = str.substring(1); //78

        String codeForCh = codes[ch-48];  // 48 == '0'
        for(int i=0; i<codeForCh.length(); i++){
          char chChoosed = codeForCh.charAt(i);
          printKPC(restOfString, ans + chChoosed);
        }
    }

}