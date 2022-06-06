import java.util.*;

public class Main{
  public static void main(String[] pranjal) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    if(n % 2 == 0 && n > 0)
    System.out.println("Even - Positive");
    else if(n % 2 == 0 && n < 0)
    System.out.println("Even - Negative");
    else if(n % 2 != 0 && n < 0)
    System.out.println("Odd - Negative");
    else if(n % 2 != 0 && n > 0)
    System.out.println("Odd - Positive");
    else
    System.out.println("Zero");
  }

}