import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scan = new Scanner(System.in);
      String str = scan.nextLine();

      Stack<Character> st = new Stack<>();
      for(int i = 0; i < str.length(); i++){
        char ch = str.charAt(i);
        if(ch == ')'){
          if(st.peek() == '('){
            System.out.println(true); // there is duplicacy
            return;
          }else {
            while(st.peek() != '('){
              // if we get a closing bracket pop all the elment till we get first bracket
              st.pop();
            }
            st.pop();
          }
        }else {
          st.push(ch);
        }
      }
      //out of loop

      System.out.println(false); // no duplicacy

    }

}