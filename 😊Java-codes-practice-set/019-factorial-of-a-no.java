import java.util.*;

public class main{
  public static void main(String[] pranjal) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    for (int i =0; i<t; i++){
        long n = scan.nextLong();
        System.out.println(factorial(n));
    }
    
  }
  
  
  private static long factorial(long n){
      if(n == 0) return 1;
    return n * factorial(n-1);
  }
}