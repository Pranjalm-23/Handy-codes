// no. of ways to reach nth step skipping max of 1 step

import java.util.*;

public class main{
  public static void main(String[] pranjal) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    
    int a = 0, b = 1;
    int an = n == 1 ? 1:0;

    for (int i = 1; i<n; i+= 1)
    {
      an = a + b;
      a = b;
      b = an;
    }
    
    System.out.println(an);
  }
}