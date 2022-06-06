import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // write your code here
      Scanner scan = new Scanner(System.in);
      int no = scan.nextInt();
      
      int a = 0, b = 1;
      System.out.println(a);
      System.out.println(b);
      for( int i= 3; i <=no; i++)
      {
          int nth = a + b;
          System.out.println(nth);
          a = b;
          b = nth;
      }
      
   }
  }