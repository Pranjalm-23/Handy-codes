import java.util.*;

public class Main{
  public static void main(String[] pranjal) {
    Scanner scan = new Scanner(System.in);
    int a =  (int) scan.nextInt();
    
    int count = 0;
    while(count < 10)
    {
      System.out.println( a * (count + 1));
      count++;
    }
    

    }

}