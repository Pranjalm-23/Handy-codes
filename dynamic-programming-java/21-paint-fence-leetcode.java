// In this problem you are given a number n and a number k in separate lines, representing the number of fences and number of colors.

// You are required to calculate and print the number of ways in which the fences could be painted so that not more than two consecutive fences have the same color

import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int k = scn.nextInt();

    long[] dp = new long[n + 1];
    long same = k * 1;
    long diff = k *  (k - 1);
    long total = same + diff;

    for (int i = 3; i <= dp.length; i++) {
      same = diff * 1;
      e
      diff = total * (k - 1);
      total = same + diff;
    }

    System.out.println(total);
  }
}