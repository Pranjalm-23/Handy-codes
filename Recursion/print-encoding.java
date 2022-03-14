import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scan = new Scanner(System.in);
      String str = scan.next();
      printEncodings(str,"");
    }

    public static void printEncodings(String str,String asf) {
        if(str.length() == 0){

          System.out.println(asf);
          return;

        } else if(str.length() == 1){
          char ch = str.charAt(0);

          if(ch == '0'){
            return;
          } else {
            int chv = ch - '0'; //making it a value using ascii rules
            char code = (char)('a' + chv -1);
            asf = asf + code;
            System.out.println(asf);
          }

        } else {
          char ch = str.charAt(0);
          String restOfStr = str.substring(1);

          //character by char encode
          if(ch == '0'){
            return;
          } else {
            
            int chv = ch - '0'; //making it a value using ascii rules
            char code = (char)('a' + chv -1);
            printEncodings(restOfStr,asf+code);
          }

        //two char encrypted at once like 11, 12, ..., 26  =>k,l,m....

        String ch12 =str.substring(0,2);
        String restOfStr12 = str.substring(2);

        int ch12v = Integer.parseInt(ch12);
        if(ch12v <= 26) {
          char code = (char)('a' + ch12v -1);
          printEncodings(restOfStr12, asf + code);
        }
    }

}
}