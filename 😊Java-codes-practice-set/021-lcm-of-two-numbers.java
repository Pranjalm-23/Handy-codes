import java.util.*;

public class main{
  public static void main(String[] pranjal) {
    Scanner scan = new Scanner(System.in);
    int n1 = scan.nextInt();
    int n2 = scan.nextInt();
    int lcm = n1*n2;
    for (int i = Integer.max(n1,n2); i<n1*n2; i+= 1)
    {
      if (i % n1 == 0 && i % n2 ==0)
      {
        lcm = i;
        break;
      }
    }
    System.out.println(lcm);
  }
}