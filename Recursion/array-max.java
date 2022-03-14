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
    scan.close();
    System.out.println(maxOfArray(a, 0));
  }

  public static int maxOfArray(int[] arr, int idx) {
    if (idx == arr.length - 1) {
      return arr[idx];
    }
    int maxofafterArr = maxOfArray(arr, idx + 1);
    if (maxofafterArr > arr[idx]) {
      return maxofafterArr;
    } else {
      return arr[idx];
    }
  }

}