import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    int base1 = scan.nextInt();
    int base2 = scan.nextInt();
    scan.close();
    int result = convertToDecimal(number, base1);
    result = convertToNewBase(result, base2);
    System.out.println(result); 
    

  }

  public static int convertToDecimal(int number, int base) {
    // collect digits and keep adding place values
    int rv = 0;
    int power = 1;

    while(number > 0){
      int dig = number % 10;
      number = number / 10;

      rv += dig * power;
      power = power * base;

    }    
    return rv;
  }

  public static int convertToNewBase(int number, int base) {
    //divide and collect the remainders
    int rv = 0;
    int power = 1;

    while(number > 0){
      int dig = number % base;
      number = number / base;

      rv += dig * power;
      power = power * 10;
    }
    return rv;
  }

}