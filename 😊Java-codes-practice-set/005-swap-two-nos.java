import java.util.*;

public class Main{
  public static void main(String[] pranjal) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    System.out.println("a = "+a+ ", b = "+b);

    int temp = a;
    a = b;
    b = temp;
    System.out.println("a = "+a+ ", b = "+b);
    
    
  }
}