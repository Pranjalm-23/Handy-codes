// Math.pow(r,n-1)

import java.util.*;

public class Main{
  public static void main(String[] pranjal) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int r = scan.nextInt();
    int n = scan.nextInt();


    System.out.println(a * (int)Math.pow(r, n-1));
    
  }

}