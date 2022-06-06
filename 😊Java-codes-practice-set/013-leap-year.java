import java.util.*;

public class Main{
  public static void main(String[] pranjal) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    if(n % 400 == 0 || n % 100 == 0 && n % 4 == 0)
    System.out.println("Leap");
    else
    System.out.println("Not Leap");
  }

}