import java.util.*;

public class main{
  public static void main(String[] pranjal){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
  
    // to find no of digits
    int nod = 0;
    int temp = n;
    while(temp > 0){
      temp /= 10;
      nod++;
    }

    k = k % nod;
    while(k < 0){
      k = k + nod;
    }

    int divisor = 1;
    int multiplier = 1;
    for(int i = 1; i <= nod; i++){
      if(i<=k){
        divisor *= 10;
      } else{
        multiplier *=10;
      }
    }

    int q = n / divisor;
    int r = n % divisor;

    // rotated no
    int ans = r * multiplier + q;
    System.out.println(ans);
    
  }
}