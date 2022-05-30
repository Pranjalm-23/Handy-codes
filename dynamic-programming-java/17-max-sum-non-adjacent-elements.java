// You are given a number n, representing the count of elements.
// You are given n numbers, representing n elements.
// You are required to find the maximum sum of a subsequence with no adjacent elements.

import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    scn.close();
    int[]arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    int inc = arr[0]; // first element                                     //1
    int exc = 0;

    for (int i = 1; i < n; i++) {
      int ninc = exc + arr[i];                            //2
      int nexc = Math.max(inc, exc);
      inc = ninc;                                         //3
      exc = nexc;
    }

    System.out.println(Math.max(inc, exc));                 //4


  }
}