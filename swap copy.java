import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int y = scan.nextInt();
    scan.close();

    // printing the initial values
    System.out.println("x = " + x + ", y = " + y);

    // swapping using algebric operations

    x = x + y;
    y = x - y;
    x = x - y;
    
    // printing the final values
    System.out.println("x = " + x + ", y = " + y);
  }
}