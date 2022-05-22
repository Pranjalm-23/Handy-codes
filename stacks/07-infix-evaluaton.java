import java.io.*;
import java.util.*;

public class Main {


  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // Assumptions:
    // 1. brackets may be there
    // 2. operands and single digt no. only
    // 3. +- < ^ < */   (leftone first if same priority)

    // any operator tries to let solve the operators with higher priorities upto when finds opening bracket/ smaller priority

    // code

    Stack<Integer> opnds = new Stack<>();
    Stack<Character> optors = new Stack<>();
    for (int i = 0; i < exp.length(); i++) {
      char ch = exp.charAt(i);

      if (ch == '(') {
        optors.push(ch);

      } else if (Character.isDigit(ch)) {
        opnds.push(ch - '0'); // char to int

      } else if (ch == ')') {
        while (optors.peek() != '(') {
          char optor = optors.pop();
          int v2 = opnds.pop();
          int v1 = opnds.pop();
          int solution = operation(v1, v2, optor);
          opnds.push(solution);

        }
        optors.pop();

      } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
        // ch solving the higher priority operators
        while (optors.size() > 0 && optors.peek() != '(' && precedence(ch) <= precedence(optors.peek())) {
          char optor = optors.pop();
          int v2 = opnds.pop();
          int v1 = opnds.pop();
          int solution = operation(v1, v2, optor);
          opnds.push(solution);
        }
        // then  push the ch
        optors.push(ch);

      }

    }
    while (optors.size() != 0) {
      char optor = optors.pop();
      int v2 = opnds.pop();
      int v1 = opnds.pop();
      int solution = operation(v1, v2, optor);
      opnds.push(solution);
    }

    System.out.println(opnds.peek());
  }
  

  public static int precedence(char optor) {
    if (optor == '+') {
      return 1;
    } else if (optor == '-') {
      return 1;
    } else if (optor == '*') {
      return 2;
    } else {
      return 2;
    }
  }


  public static int operation(int v1, int v2, char optor) {
    if (optor == '+') {
      return v1 + v2;
    } else if (optor == '-') {
      return v1 - v2;
    } else if (optor == '*') {
      return v1 * v2;
    } else {
      return v1 / v2;
    }
  }
}