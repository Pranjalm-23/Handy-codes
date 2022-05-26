import java.util.*;
import java.math.BigInteger;

public class Main{

  static BigInteger factorial(int n){
    BigInteger b = new BigInteger("1");
    for(int i = 2; i<=n; i++){
      b.multiply(BigInteger.valueOf(i));
    }
  }


  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    System.out.println(factorial(n));
    
    
  }
}