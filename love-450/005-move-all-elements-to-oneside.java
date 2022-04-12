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
  
    int[] a = new int[arrayLength];
    int left=0, right= arrayLength-1;

    //putting negatives to left and others to the right
    for(int i=0; i < arrayLength; i++){
      if(arr[i] < 0){
        a[left] = arr[i];
        left++;
      } else{
        a[right] = arr[i];
        right--;
      }
    }

    for(int j = 0; j < arrayLength; j++){
      System.out.print(a[j]+" ");
      
    }

  }
 
}