/* 
we are given an input n representing the numbers of days and we are given n values representing the price of stocks on each day. We are also given k which represents the number of transactions allowed. We have to find the maximum profit that can be made in n days with k transactions allowed. Also, there is a condition that there should not be any overlapping transactions. This means that we can not buy another stock before selling the previous one.
*/

import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++)
    {
      arr[i] = scn.nextInt();
    }
    int k = scn.nextInt();

    int[][]dp = new int[k + 1][n];

    for (int t = 1; t <= k; t++) //transaction
    {
      int max = Integer.MIN_VALUE; //max of last row
      for (int d = 1; d < arr.length; d++) // day
      {
        if (dp[t - 1][d - 1] - arr[d - 1] > max) 
        {
          max = dp[t - 1][d - 1] - arr[d - 1]; //update max
        }

        if (max + arr[d] > dp[t][d - 1])    //comapre max + arr[d], dp[t][d-1]
        {
          dp[t][d] = max + arr[d];
        }
        else
        {
          dp[t][d] = dp[t][d - 1];
        }
      }
    }
    System.out.println(dp[k][n - 1]);
  }

}