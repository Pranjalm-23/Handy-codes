import java.util.*;

public class Main{

  public static void main(String[] args) {
    Scanner scan = new Scanner(Sysrtem.in);
    int base = scan.nextInt();
    int number1 = scan.nextInt();
    int number2 = scan.nextInt();
    scan.close();
    int result = performAddition(number1, number2, base)
    System.out.println(result);
    

    
  }

  public static int performAddition(int number1, int number2, int base) {
    int rv = 0;
    int carry = 0;
    int power = 1;

    while(number1 > 0 || number2 > 0 || c > 0){
      int d1 = number1 % 10;
      int d2 = number2 % 10;

      number1 = number1 / 10;
      number2 = number2 / 10;

      int d = d1 + d2 + carry;
      carry = d / base;
      d = d % base;

      rv += d * power;
      power = power * 10;  // for creating place value 


    }

    return rv; 

  }
}