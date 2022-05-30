import java.io.*;
import java.util.*;

// arraylist: .size()  .get(idx)   .add(n)   .add(idx, val)
// arraylist is a dynamic array

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scan = new Scanner(System.in);
      String str = scn.next(); // input string
      ArrayList<String> res = gss(str);
      System.out.println(res);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){             // length of string
          ArrayList<String> baseResult = new ArrayList<>();
          baseResult.add("");
          return baseResult;
        }


        char ch = str.charAt(0);  // finding the character
        String restOfString = str.substring(1);  // finding substring
        ArrayList<String> recursionResult = gss(restOfString);
        ArrayList<String> myResult = new ArrayList<>();

        //if no
        for(String rstr : recursionResult){
          myResult.add(""+rstr);
        }

        // if yes
        for(String rstr : recursionResult){
          myResult.add(ch+rstr);
        }
        return myResult;
    }

}