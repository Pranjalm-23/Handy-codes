import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = scan.nextInt();
    }
    int data = scan.nextInt();
    scan.close();
    System.out.println(firstIndex(a,0,data));
  }

  public static int firstIndex(int[] arr, int idx, int x) {
  //  Approach-1 not so optimum
  //   if(idx == arr.length){
  //     return -1;
  //   }
  //   int firstIndexofAfterArr = firstIndex(arr, idx+1, x);
  //   if(arr[idx] == x){
  //     return idx;
  //   }else{
  //     return firstIndexofAfterArr;
  //   }
  // }

  //Approach-2: optimum
  if(idx == arr.length){
    return -1;
  }
  if(arr[idx] == x){
    return idx;
  }else{
    int firstIndexofAfterArr = firstIndex(arr, idx+1, x);
    return firstIndexofAfterArr;
  }
}

}