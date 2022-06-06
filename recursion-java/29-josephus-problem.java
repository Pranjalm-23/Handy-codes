import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    System.out.println(josephus(n, k));
    
  }
  private static int josephus(int n, int k) {
    if(n==1)
    {
      return 1;
    }

    return (josephus(n-1, k) + k) % n;
    
  }
}