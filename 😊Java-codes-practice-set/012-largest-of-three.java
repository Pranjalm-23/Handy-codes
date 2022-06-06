// possible approaches
import java.util.*;

public class Main{
  public static void main(String[] pranjal) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();

    int max = Integer.MIN_VALUE;
    if(a > max) max = a;
    if(b > max) max = b;
    if(c > max) max = c;
    System.out.println(max);
    


    
  }

}