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
    displayArrReverse(a, 0 );
  }

  public static void displayArrReverse(int[] arr, int idx) {
    if (idx == arr.length) {
      return;
    }
    displayArrReverse(arr, idx + 1);
    System.out.println(arr[idx]);
  }

}