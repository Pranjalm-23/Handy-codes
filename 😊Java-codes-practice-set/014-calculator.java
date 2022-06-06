import java.util.*;

public class Main{
  public static void main(String[] pranjal) {
    Scanner scan = new Scanner(System.in);
    int a =  (int) scan.nextInt();
    int b =  (int) scan.nextInt();
    char opr = scan.next()

    switch(opr){
      case '+':
      System.out.println(a+b);
      break;
      case '-':
      System.out.println(a-b);
      break;
      case '*':
      System.out.println(a*b);

    }

}