import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int n  = scan.nextInt();
    System.out.println(factorial(n));
  }

  public static int factorial(int n) {
    if (n == 1) {
      return 1;
    }
    int fact = factorial(n - 1);
    int factA = n * fact;
    return factA;
  }

}