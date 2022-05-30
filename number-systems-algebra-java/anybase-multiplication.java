import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int base = scan.nextInt();
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    scan.close();
    int result = performMultiplication(base, num1, num2);
    System.out.println(result);    
  }

  public static int  performMultiplication(int base, int num1, int num2 ) {

    int rv = 0;
    int power = 1;

    while(num2 > 0){
      int d2 = num2 % 10;
      num2 = num2 / 10;
      int digitProduct = multiplicationWithSingleDigit(base, num1, d2);
      rv = getSum(base, rv, digitProduct * power);
      power = power * 10;
    }
    return rv;
  }

  public static int  multiplicationWithSingleDigit(int base, int num1, int d2 ) {
    int rv = 0;
    int carry = 0;
    int power = 1;

    while(num1 > 0 || carry > 0){
      int d1 = num1 % 10;
      num1 = num1 / 10;

      int d = d1 * d2 + carry;

      carry = d / base;
      d = d % base;

      rv = rv + d * power;
      power = power * 10;


    }

    return rv;
  }

  public static int  getSum(int base, int number1, int number2 ) {
    int rv = 0;
    int carry = 0;
    int power = 1;

    while(number1 > 0 || number2 > 0 || carry > 0){
      int d1 = number1 % 10;
      int d2 = number2 % 10;

      number1 = number1 / 10;
      number2 = number2 / 10;

      int d = d1 + d2 + carry;
      carry = d / base;
      d = d % base;

      rv += d * power;
      power = power * 10;


    }

    return rv; 
  }
}



// logic:
//  multiplying num1 with digits of num2 and adding in appropriate way