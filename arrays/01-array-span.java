import java.util.*;

//span = max-min

public class Main{

  public static void main(String[] args)  {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] arr = new int[n];

    int max = 0;
    int min = 0; 
    for(int i = 0; i < n; i++){
      arr[i] = scan.nextInt();

      if(i == 0){
        max = arr[i];
        min = arr[i];
      }

      if(max < arr[i]){
        max = arr[i];
      }

      if(min > arr[i]) min = arr[i];
      
      if(i == n-1){
           System.out.println(max-min);
      }
    }
    scan.close();

   
    

  }

}