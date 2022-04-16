import java.util.*;
// Bar chart

public class Main{

  public static void main(String[] args)  {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] arr = new int[n];

    for(int i = 0; i < n; i++){
      arr[i] = scan.nextInt();
    }
    scan.close();
    
    // find max
    int max = arr[0];
    for(int i = 0; i < arr.length; i++){
      if(arr[i] > max) max = arr[i];
    }

    for(int floor = max; floor >= 1; floor--){
      for(int i = 0; i < arr.length; i++){
        if(arr[i] >= floor){
          System.out.println("*\t");
          
        } else{
          System.out.println("\t");
          
        }
      }
      System.out.println();
      
    }

  }

}