import java.util.*;
import java.math.BigInteger;

public class Main{

  static void playWithBigIntegers(){
    BigInteger b1 = new BigInteger("12");
    BigInteger b2 = new BigInteger("100000000000");  // input as string required
    System.out.println(b1);

    // addition
    System.out.println(b1.add(b2)); 

    //multiply
    System.out.println(b1.multiply(b2));

    // set-bit count
   System.out.println(b1.bitCount());

   // total no.of bits
   System.out.println(b1.bitLength());
   
   // integer into big Integer
   int a = 120;
   BigInteger b3 =(BigInteger.valueOf(a));
   System.out.println(b3);
   
   // gcd
   System.out.println(b3.gcd(b1));

   // base conversion-- inteterpreates the no.ingiven base
   BigInteger b4 = new BigInteger("101",2);
   System.out.println(b4);
   
   // power of no
   System.out.println(b3.pow(20));
   
   // .add    .subtract     .divide     
    
    
    
    
  }


  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();

    playWithBigIntegers();
    
  }
}