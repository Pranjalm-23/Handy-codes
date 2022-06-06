import java.util.*;

public class Main{
  public static void main(String[] pranjal) {
    Scanner scan = new Scanner(System.in);
    int a =  (int) scan.nextInt();
    
    int count = 0;
    while(a > 0)
    {
      a = a / 10;
      count++
    }

    System.out.println("No of Digits: "+count);
    

    }

}