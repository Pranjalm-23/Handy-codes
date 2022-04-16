import java.util.*;

public class Main{

  public static void main(String[] args)  {
    Scanner scan = new Scanner(System.in);
    int noOfTestCases = scan.nextInt();
    for(int i = 0; i < noOfTestCases; i++){
        int oneCoins = scan.nextInt();
        int twoCoins = scan.nextInt();
        checkMoneyCantBePaid(oneCoins, twoCoins);
    }
  }
  
  public static void checkMoneyCantBePaid(int one, int two){
      if(one < 1){
          System.out.println(1);
          
      }else{
          System.out.println(one + two * 2 + 1);
      }
      
  }
}