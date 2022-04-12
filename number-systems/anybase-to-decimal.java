import java.util.*;

public class Main{
  public public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    int base = scan.nextInt();
    scan.close();
    int result = convertToDecimal(number, base);
    System.out.println(result); 
    

  }

  public static int convertToDecimal(int number, int base) {
    // collect the digits and find place values  and keep adding
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
}