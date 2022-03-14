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
    System.out.println(lastIndex(a, 0, data));
  }

  public static int lastIndex(int[] arr, int idx, int x) {
    if(idx == arr.length){
      return -1;
    }
    int lastIndexOfAfterArray = lastIndex(arr, idx+1, x);
    if(lastIndexOfAfterArray == -1){
      if(arr[idx]==x){
        return idx;
      }else{
        return -1;
      }
    } else {
      return lastIndexOfAfterArray;
    }
}
}