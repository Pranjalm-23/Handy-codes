import java.util.*;

public class main{
  public static void main(String[] pranjal) {

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    int originalPlace = 1;
    int inv = 0;

    while( n != 0)
    {
     int odigit = n % 10;
     int idigit = originalPlace;
     int invertedPlace = odigit;

     inv = inv + idigit * (int)Math.pow(10, invertedPlace - 1);
     originalPlace++;
    }
    System.out.println(inv);
    
    
  }
}