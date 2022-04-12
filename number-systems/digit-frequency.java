import java.util.*;

public class Main{
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int d = scan.nextInt();
    int f = getDigitFrequency(n, d);
    System.out.println(f);
    
    
  }

  public public static int getDigitFrequency(int n, int d) {
    int rf = 0;
    while(n > 0){
      int dig = n % 10;
      n = n / 10;

      if(dig == d){
        rf++;
      }
    }
    return rf;
  }
}