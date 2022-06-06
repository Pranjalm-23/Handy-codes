import java.util.*;

public class main{
  public static void main(String[] pranjal)
  {
    Scanner scan = new Scanner(System.in);
    int n1 = scan.nextInt();
    int n2 = scan.nextInt();
    int gcd = 1;
    for(int i = 2; i<=Integer.min(n1,n2); i++)
    {
      if (n1 % i == 0  && n2 % i == 0)
      {
        gcd = i;
      }
    }
    System.out.println(gcd);
    
  }
}