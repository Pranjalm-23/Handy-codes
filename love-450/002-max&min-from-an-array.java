import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    int arrayLength = scan.nextInt();
    int[] arr = new int[arrayLength];
    for(int i = 0; i < arrayLength; i++){
      arr[i] = scan.nextInt();
    }
    scan.close();

    int max = arr[0], min = arr[0];

    for(int i = 1; i < arrayLength; i++){
      if(max < arr[i]){
        max = arr[i];
      }

      if(min > arr[i]){
        min = arr[i];
      }
    }

    System.out.println("Maximum :" + max + "\nMinimum :" + min);
    


    
  }
}