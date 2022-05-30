/* 
You are given a number n, representing the number of elements.
You are given a number k, representing the number of subsets.
You are required to print the number of ways in which these elements can be partitioned in k non-empty subsets.
For example, If we have n=4,1234 and we want to divide it into 3 subsets we can do it these ways.
1-2-34
1-23-4
12-3-4
13-2-4
14-2-3
1-24-3

P.S A set cannot be empty like 12-34-. is not a valid partition.
 */

import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int k = scn.nextInt();

    if (n == 0 || k == 0 || n < k) {
      System.out.println(0);
      scn.close();
      return;
    }

    long[][] dp = new long[k + 1][n + 1];

    for (int t = 1; t <= k; t++) {  //teams
      for (int p = 1; p <= n; p++) { //people
        // people = teams
        if (p == t){
          dp[t][p] = 1;
        // teams less than peple
        } else if (p > t)
          dp[t][p] = t * dp[t][p - 1] + dp[t - 1][p - 1];
      }
    }
    System.out.println(dp[k][n]);
    scn.close();
  }
}