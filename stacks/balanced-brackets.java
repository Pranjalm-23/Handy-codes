import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scan = new Scanner(System.in);
      String str = scan.nextLine();
      scan.close();

      Stack<Character> st = new Stack<>();
      for(int i=0; i<str.length(); i++){
        char ch = str.charAt(i);
        
        if(ch == '(' || ch == '{' || ch == '['){
          st.push(ch);

        } else if (ch == ')'){
          boolean val = handleClosing(st, '(');
          if(val == false) {
            System.out.println(val);
            return;
          }


        } else if (ch == '}'){
          boolean val = handleClosing(st, '{');
          if(val == false) {
            System.out.println(val);
            return;
          }

        } else if (ch == ']'){
          boolean val = handleClosing(st, '[');
          if(val == false) {
            System.out.println(val);
            return;
          }

        } else{
            
        }
      }
      if(st.size() == 0){
        System.out.println(true);
      }else {
        System.out.println(false);
      }

    }

    public static boolean handleClosing(Stack<Character> st, char correspondingOpeningChar){
      if(st.size() == 0){
        // extra closing
        // System.out.println(false);
        // return;
        return false;
      } else if (st.peek() != correspondingOpeningChar){
        // missing/mismatch/no counterpart
        // System.out.println(false);
        // return;
        return false;
      } else {
        st.pop();
        return true;
      }
    }

}