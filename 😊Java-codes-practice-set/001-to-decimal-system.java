import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int base = scan.nextInt();

    System.out.println(toDecimal(num, base));
    
    
  }
  private static int toDecimal(int num, int base) {
    int decimalValue = 0;
    int multiplier = 1;
    while(num > 0){
      int d = num % 10;
      decimalValue += d * multiplier;

      num = num / 10;
      multiplier *= base;
    }

    return decimalValue;
  }
}