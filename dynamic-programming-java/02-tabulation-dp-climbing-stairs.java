import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int paths = countPathsTab(n);
    System.out.println(paths);

    scn.close();
  }

  public static int countPathsTab(int n) {
    if (n == 0) {
      return 1;
    } else if (n < 0) {
      return 0;
    }
    // storage and meaning
    int[] dp = new int[n + 1];

    dp[0] = 1; // direction
    
    for (int i = 1; i <= n; i++) {
      // travel and solve--no recursion only iteration
      dp[i] = dp[i - 1];
      if (i >= 2)
        dp[i] += dp[i - 2];
      if (i >= 3)
        dp[i] += dp[i - 3];
    }

    return dp[n];
  }
}