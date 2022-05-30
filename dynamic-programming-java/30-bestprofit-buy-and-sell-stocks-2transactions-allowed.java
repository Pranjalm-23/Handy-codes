/* 
We have been given n numbers representing n number of days and we are given n numbers representing the price of a stock in those n days. We have to find the maximum profit that we can obtain when only two transactions are allowed. Also, there cannot be any overlapping transaction meaning you have to sell a purchased stock before buying another one.
 */

import java.io.*;

import java.util.*;

public class Main {


  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }

    int misf = arr[0];   // least so far
    int[] ps = new int[arr.length];  // maximum profit possible upto today
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < misf) {
        misf = arr[i];  
      }

      if (arr[i] - misf > ps[i - 1]) { //if new profit is greater
        ps[i] = arr[i] - misf;
      } else {
        ps[i] = ps[i - 1];
      }
    }

    int masf = arr[arr.length - 1];  // max after today
    int[] pb = new int[arr.length];  // maximum profit from today
    for (int i = arr.length - 2; i >= 0; i--) {
      if (arr[i] > masf) {
        masf = arr[i];
      }

      if (masf - arr[i] > pb[i + 1]) { //if new profit is greater
        pb[i] = masf - arr[i];
      } else {
        pb[i] = pb[i + 1];
      }
    }

    int mp = Integer.MIN_VALUE;  // maximum overall profit
    for (int i = 0; i < arr.length; i++) {
      if (ps[i] + pb[i] > mp) {
        mp = ps[i] + pb[i]; 
      }
    }

    System.out.println(mp);
  }
}