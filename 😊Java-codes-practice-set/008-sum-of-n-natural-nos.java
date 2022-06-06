// show error for invalid inputs
import java.util.*;

public class Main{
  public static void main(String[] pranjal) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    if(n > 0)
    {
      System.out.println(n * (n+1) / 2);
    } else
    {
      System.out.println("Invalid Input");
      
    }
        
  }

}