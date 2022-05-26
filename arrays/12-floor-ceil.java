import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
      arr[i] = scan.nextInt();
    }

    int data = scan.nextInt();


    int l = 0;
    int h = n-1;
    int floor = Integer.MIN_VALUE;
    int ceil = Integer.MAX_VALUE;    

    while(l!=h){
      int m = (l+h)/2;

      if(arr[m] < data){
        floor = arr[m];
        l = m+1;
      } else if(arr[m]>data){
        ceil = arr[m];
        h = m-1;
      }

    }
    System.out.println("Ceil: "+ceil+", data:"+data+", Floor: "+floor);
    
  }
}