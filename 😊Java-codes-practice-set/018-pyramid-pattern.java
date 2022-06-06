import java.util.*;

public class main{
  public static void main(String[] pranjal) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    for(int i=0; i<n; i++)
    {
      for(int j = 0; j<n-1-i; j++)
      {
        System.out.print(" ");
        
      }

      for(int j = n-1-i; j<n; j++)
      {
        System.out.print("*");
        
      }

      for(int j = n; j<n+i; j++)
      {
        System.out.print("*");
        
      }
      System.out.println();
    }
  }
}