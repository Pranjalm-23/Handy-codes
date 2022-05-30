// you are given a number n and a number k in separate lines, representing the number of houses and number of colors.

// In the next n rows, you are given k space separated numbers representing the cost of painting the house with one of the k colors.

// You are required to calculate and print the minimum cost of painting all houses without painting any consecutive house with the same color.

import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int nc = scn.nextInt();

    int[][] arr = new int[n][nc];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < nc; j++) {
        arr[i][j] = scn.nextInt();
      }
    }

    // solution

    int[][] dp = new int[arr.length][arr[0].length];
    
    for (int j = 0; j < arr[0].length; j++) {
      dp[0][j] = arr[0][j];
    }

    for (int i = 1; i < dp.length; i++) {
        for (int j = 0; j < dp[0].length; j++) {
                int min = Integer.MAX_VALUE;

                // to find the smallest for each block: made complexity n^3
                for (int k = 0; k < dp[0].length; k++) {
                  if (k != j) {
                    if (dp[i - 1] [k] < min) {
                      min = dp[i - 1][k];
                    }
                  }
                }

                dp[i][j] = arr[i][j] + min;
        }
    }

    int min = Integer.MAX_VALUE;
    for ( int k = 0; k < dp[0].length; k++) { 
      if ((dp[n - 1][k]) < min) {
        min = dp[n - 1][k]; // min of last row
      }
    }

    System.out.print(min);
  }
}