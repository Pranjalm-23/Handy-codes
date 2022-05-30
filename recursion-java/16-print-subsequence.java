import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scan =new Scanner(System.in);
      String str = scan.nextLine();
      printSS(str,"");
      // we are not storing the values found in memory instead we are just printing them when reached base case;

    }

    public static void printSS(String str, String ans) {
        if(str.length() ==0){
          System.out.println(ans);
          return;
        }
        char ch = str.charAt(0);
        String restOfStr = str.substring(1);
        
        printSS(restOfStr, ans+ch);
        printSS(restOfStr,ans+"");
        
    }

}