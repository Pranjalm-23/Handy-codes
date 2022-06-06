// *****
// *****
// *****
// *****
// *****

// 11111
// 22222
// 33333
// 44444
// 55555

// *
// **
// ***
// ****
// *****

import java.util.*;

public class Main{
  public static void main(String[] pranjal) {
    Scanner scan = new Scanner(System.in);
    int a =  (int) scan.nextInt();
    
    int temp = a;
    while(temp > 0)
    {
      for(int i = 0; i < a; i++)
      {
        System.out.print("* ");
        
      }
      System.out.println();
      temp--;
      
    }
    
    int temp = a;
    while(temp > 0)
    {
      for(int i = 0; i < a; i++)
      {
        System.out.print(temp + " ");
        
      }
      System.out.println();
      temp--;
      
    }

    }

}