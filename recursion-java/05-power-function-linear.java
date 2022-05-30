import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int n = scan.nextInt();
    System.out.println(power(x, n));
  }

  public static int power(int x, int n) {
    if (n == 0) {
      return 1;
    }
    int xn1 = power(x, n - 1);
    int xn = x * xn1;
    return xn;
  }

}