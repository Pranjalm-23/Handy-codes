import java.util.*;

public class main{
  public static void main(String[] pranjal) {

    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();

    int power = 1;
    int temp = n;

    while(temp>=10)
    {
      temp /= 10;
      power *= 10;
    }

    temp = n;
    while(power != 0)
    |{
      int digit = temp/power;
      System.out.println(digit);
      
      temp = temp % power;
      power = power/10;
      
    }
    
  }
}