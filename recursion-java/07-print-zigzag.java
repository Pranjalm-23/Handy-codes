import java.util.*;

public class zigzag {
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    scn.close();
    pzz(n);
  }

  public static void pzz(int n) {
    if (n == 0)
      return;
    System.out.print(n + " "); // pre
    pzz(n - 1);
    System.out.print(n + " "); // in
    pzz(n - 1);
    System.out.print(n + " "); // post
  }
}