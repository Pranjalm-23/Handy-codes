import java.util.*;

public class Main{

  public static void main(String[] args)  {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] arr = new int[n];

    for(int i = 0; i < n; i++){
      arr[i] = scan.nextInt();
    }

    int target = scan.nextInt();
    scan.close();
    int idx = -1
    for(int i = 0; i < n; i++){
      if(arr[i] == target){
        idx = i;
        break;
      }
    }
   
    System.out.println(idx);
    

  }

}