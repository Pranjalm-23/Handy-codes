// you are given a number n. All we need to print is the number of binary strings of length n with no consecutive 0's

// include-exclude style

import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int zeroes = 1;
    int ones = 1;
    for (int i = 2; i <= n; i++) {
      int newczeroes = ones;
      int newcones = ones + zeroes;

      zeroes = newczeroes;
      ones = newcones;
    }

    System.out.println(zeroes + ones);
  }

}