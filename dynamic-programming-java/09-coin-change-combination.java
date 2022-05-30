// You are given an array of n numbers, which represents n different types of denominations of coins. You are given a target 'amt', you need to count the number of combinations of the coins possible that sum up to the given target amount, i.e. in how many ways you can pay 'amt' using the available denominations.

// Note 1: You can consider that you are having infinite supply of each coin denomination i.e. the same coin denomination can be used for many installments in payment of "amt".

// Note 2: You are required to find the count of combinations and not permutations. For eg, 2 + 2 + 3 = 7 and 2 + 3 + 2 = 7 and 3 + 2 + 2 = 7 are different permutations of the same combination. You should treat them as 1 and not 3.


import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] coins = new int[n];

    for (int i = 0; i < n; i++) {
      coins[i] = Integer.parseInt(br.readLine());
    }

    int amt = Integer.parseInt(br.readLine());

    int[] dp = new int[amt + 1];
    dp[0] = 1;

    // all loop ran on same 1-d array to get the combination only i.e. permutation is stopped
    for (int coin : coins) {
      for (int i = coin; i < dp.length; i++) {
        if (i >= coin) {
          dp[i] += dp[i - coin];
        }
      }
    }
    System.out.println(dp[amt]);
  }
}