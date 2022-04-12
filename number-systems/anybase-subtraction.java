import java.util.*;

public class Main{
public static void main() {

  Scanner scan = new Scanner(System.in);
  int base = scan.nextInt();
  int number1 = scan.nextInt();
  int number2 = scan.nextInt();
  scan.close();
  int result = performSubtraction(base, number1, number2);
  System.out.println(result);
  

}
public static int performSubtraction(int base, int number1, int number2) {
  int returnVal = 0;
  int carry = 0;  // here negative carry will work as borrow
  int power = 1;

  // number2 - number1, number2 > number1
  while(number2 > 0){

    int d1 = number1 % 10;
    int d2 = number2 % 10;

    number1 = number1 / 10;
    number2 = number2 / 10;

    int d = 0;
    d2 = d2 + carry;

    if( d2 >= d1){
      carry = 0;
      d = d2 - d1;
    } else {
      carry = -1;
      d = d2 + base - d1;
    }
    returnVal = returnVal + d * power;
    power = power * 10;


  }
  return returnVal;
}
}