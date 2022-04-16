import java.util.*;

public class Main{

  public static void main(String[] args)  {
    Scanner scan = new Scanner(System.in);
    int noOfTestCases = scan.nextInt();
    for(int i = 0; i < noOfTestCases; i++){
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        neededMoves(x1, y1);
    }
  }
  
  public static void neededMoves(int x1, int y1){
    if(x1 == 0 && y1 == 0){
        System.out.println(0);
    } else if(isASquare(x1 * x1 + y1 * y1)){
        System.out.println(1);
    } else{
        System.out.println(2);
    }
  }
  
  
  
  public static boolean isASquare(int num){
    for (int i = 0; i <= num; i++){
      if (i * i == num) {
        return true;
      }
    }
    return false;
  }
}