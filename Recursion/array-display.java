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
    displayArr(a, 0 );
  }

  public static void displayArr(int[] arr, int idx) {
    if (idx == arr.length) {
      return;
    }
    System.out.println(arr[idx]);
    displayArr(arr, idx + 1);
  }

}