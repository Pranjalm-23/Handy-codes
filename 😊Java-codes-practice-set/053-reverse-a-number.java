import java.util.*;

public class main{
  public static void main(String[] pranjal) {

    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();

   int reverse = 0;

    while(n!=0)
    {
     int digit = n%10;
     n = n/ 10;
     
     reverse *= 10;
     reverse = reverse + digit;
  
    }
    System.out.println(reverse);
    
    
  }
}