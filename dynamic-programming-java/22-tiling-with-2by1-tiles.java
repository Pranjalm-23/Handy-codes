// We are given a floor whose width is 2m and its length is n meters. We are also given infinite tiles of size 2x1 i.e the width of the tiles is also 2 meters but the length of each tile is 1m. We have to find the total number of ways in which we can tile up the entire floor using these tiles

import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] dp = new int[n + 1];
    dp[0] = 0;
    dp[1] = 1;
    dp[2] = 2;
    for (int i = 3; i < dp.length; i++)
    {
      dp[i] = dp[i - 1] + dp[i - 2];
    }
    System.out.println(dp[n]);
  }
}