import java.util.*;

public class Main{

  public static void main(String[] args)  {
    Scanner scan = new Scanner(System.in);
    int noOfTestCases = scan.nextInt();
    for(int i = 0; i < noOfTestCases; i++){
        int n = scan.nextInt();
        gcdVsLcm(n);
    }
  }
  
  public static void gcdVsLcm(int n) {
    // gcd(1, any no) =  1;
    // lcm(1, 1) = 1
    // so; a = 1, b = anyNo, c = 1, d = 1; which satisfies gcd(a,b) = lcm(1, 1)
    System.out.println((n-3)+" "+1+" "+1+" "+1);
    
    
  }
  

}