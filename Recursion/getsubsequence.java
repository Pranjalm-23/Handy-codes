import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scan = new Scanner(System.in);
      String str = scn.next();
      ArrayList<String> res = gss(str);
      System.out.println(res);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
          ArrayList<String> baseResult = new ArrayList<>();
          baseResult.add("");
          return baseResult;
        }
        char ch = str.charAt(0);
        String restOfString = str.substring(1);
        ArrayList<String> recursionResult = gss(restOfString);

        ArrayList<String> myResult = new ArrayList<>();
        for(String rstr : recursionResult){
          myResult.add(""+rstr);
        }

        for(String rstr : recursionResult){
          myResult.add(ch+rstr);
        }
        return myResult;
    }

}