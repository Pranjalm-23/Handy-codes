// You are given a string of digits. (will never start with a 0)
// You are required to encode the str as per the following rules
// 1 -> a
// 2 -> b
// 3 -> c
// ..
// 25 -> y
// 26 -> z
// You are required to calculate and print the count of encodings for the string str.

import java.io.*;

import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    int[] dp = new int[str.length()];

    dp[0] = 1; // only one encoding for a single character

    for (int i = 1; i < str.length(); i++) {

      // last two chars 0
      if (str.charAt(i - 1) == '0' && str.charAt(i) == '0') {
        dp[i] = 0;
      } 
      // only last second char is zero
      else if (str.charAt(i - 1) == '0' && str.charAt(i) != '0') {
        dp[i] = dp[i - 1];
      }
      // only last char is zero
      else if (str.charAt(i - 1) != '0' && str.charAt(i) == '0') {
        if (str.charAt(i - 1) == '1' || str.charAt(i - 1) == '2') {
          dp[i] = (i >= 2 ? dp[i - 2] : 1);
        }
      }
      // last two chars are non-zero both
      else {
        dp[i] = dp[i - 1];
        if (Integer.parseInt(str.substring(i - 1, i + 1)) <= 26) {
          dp[i] += (i >= 2 ? dp[i - 2] : 1);
        }
      }
    }
    System.out.println(dp[str.length() - 1]);
    scn.close();
  }
}