
//  you are given an array of different dates in format DD-MM-YYYY. You simply have to sort these dates in increasing order.


import java.io.*;

import java.util.*;

public class Main {

  public static void sortDates(String[] arr) {
    countSort(arr, 1000000, 100, 32);  // for days
    countSort(arr, 10000, 100, 13);   // for months
    countSort(arr, 1, 10000, 2501);   // for years
  }

  public static void countSort(String[] arr, int div, int mod, int range) {
    String[] ans = new String[arr.length];
    // make frequency arr
    int[] farr = new int[range];
    for (int i = 0; i < arr.length; i++) {
      farr[Integer.parseInt(arr[i], 10) / div % mod]++;
    }
    // convert it into prefix sum array
    for (int i = 1; i < farr.length; i++) {
      farr[i] += farr[i - 1];
    }
    // stable sorting(filling ans array)
    for (int i = arr.length - 1; i >= 0; i--) {
      int pos = farr[Integer.parseInt(arr[i], 10) / div % mod] - 1;
      ans[pos] = arr[i];
      farr[Integer.parseInt(arr[i], 10) / div % mod]--; // see note at the end
    }
    // filling original array with the help of ans array
    for (int i = 0; i < arr.length; i++) {
      arr[i] = ans[i];
    }
  }

  public static void print(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    String[] arr = new String[n];
    for (int i = 0; i < n; i++) {
      String str = scn.next();
      arr[i] = str;
    }
    sortDates(arr);
    print(arr);
  }

}

// Integer.parseInt(arr[i], 10)  // 10 tells the base
// otherwise, eg it takes 04, 0111 etc as octal