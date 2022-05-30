/* You are given a number n, representing the number of friends.
Each friend can stay single or pair up with any of their friends.
You are required to print the number of ways in which these friends can stay single or pair up. */

// Time Complexity: O(n),  Space Complexity: O(n)

import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] dp = new int[n + 1];

    dp[0] = 1;
    dp[1] = 1;

    for (int i = 2; i <= n; i++) {
      dp[i] = dp[i - 1] + (i - 1) * dp[i - 2];
    }
    System.out.println(dp[n]);
    scn.close();
  }
}