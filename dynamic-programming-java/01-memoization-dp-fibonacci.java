import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    scan.close();

    // recursion
    System.out.println(fib(n));

    // dp
    System.out.println(fibMemoized(n, new int[n + 1]));
    
    
    
  }

  public static int fib(int n) {
    if(n == 0 || n ==1){
      return n;
    }
    
    int fibm1 = fib(n-1);
    int fibm2 =  fib(n-2);
    int fibn = fibm1 + fibm2;
    return fibn;
  }

  public static int  fibMemoized(int n, int[] valueBank) {
    if(n == 0 || n ==1){
      return n;
    }
    
    // if you have solved a question don't solve it again
    if(valueBank[n] != 0){
      return valueBank[n];
    }

    int fibMemoizedm1 = fib(n-1);
    int fibMemoizedm2 =  fib(n-2);
    int fibn = fibMemoizedm1 + fibMemoizedm2;
    valueBank[n] = fibn;
    return fibn;
  }
}