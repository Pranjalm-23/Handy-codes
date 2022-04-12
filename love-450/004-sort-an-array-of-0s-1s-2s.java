import java.io.*;
import java.util.*;
public class Main {
  public static void main(String[] args) throws Exception {
    
    Scanner scan = new Scanner(System.in);
    int arrayLength = scan.nextInt();
    int[] arr = new int[arrayLength];
    // counting sort
    int zero = 0;
    int one = 0;
    int two = 0;

    for(int i = 0; i < arrayLength; i++){
      arr[i] = scan.nextInt();
      if(arr[i] == 0){
        zero++;
      } else if(arr[i] == 1){
        one++;
      } else{
        two++;
    }
    }
    for(int i = 0; i < zero; i++){
      arr[i] =0;
    }
    for(int i = zero; i < zero+one; i++){
      arr[i] =1;
    }
    for(int i = zero+one; i < zero+one+two; i++){
      arr[i] =2;
    }
    for(int i=0; i<arrayLength;i++){System.out.print(arr[i]+" ");}
    

  }
 
}