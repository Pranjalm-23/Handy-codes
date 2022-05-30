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
    int xnb2 = power(x, n / 2);
    int xn = xnb2 * xnb2;
    if (n % 2 != 0) {
      xn = xn * x;
    }
    return xn;
  }

}