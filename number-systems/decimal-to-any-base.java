import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    int base = scan.nextInt();
    scan.close();
    int result = convertToNewBase(number, base);
    System.out.println(result);
    

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