import java.util.*;


class PrimeTest  {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();

    for (int i = 0; i < t; i++) {
      int n = scan.nextInt();

      int div = 2;
      while (div * div <= n) {
        if (n % div == 0) {
          break;
        }
        div++;
      }

      if (div * div > n) {
        System.out.println("prime");
      } else {
        System.out.println("not prime");
      }
    }
    scan.close();

  }
}