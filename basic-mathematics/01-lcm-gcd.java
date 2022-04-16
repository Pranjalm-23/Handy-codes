import java.util.*;

public class Main{

  public static void main(String[] args)  {
    Scanner scan = new Scanner(System.in);
    int n1 = scan.nextInt();
    int n2 = scan.nextInt();
    scan.close();

    int mul = n1 * n2;

    while(n1 % n2 != 0){
      int remainder = n1 % n2;
      n1 = n2;
      n2 = remainder;
    }
    int gcd = n2;
    int lcm = mul / gcd;

    System.out.println("gcd: "+gcd+", lcm : "+lcm);
    
  }

}