// We are given two arrays representing the weights and costs of each item. We have a bag of a limited capacity and we have to fill the bag in such a way that its cost becomes maximum. This was also the case with the 0-1 KNAPSACK problem but we have a change here. We can still not include any element partially, but we can include an element more than once i.e. repetition is allowed.
// 1d-areay used in dp for duplicacy

import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] values = new int[n];
    int[] wts = new int[n];
    // items
    for (int i = 0; i < n; i++)
    {
      values[i] = scn.nextInt();
    }
    // item weights
    for (int i = 0; i < n; i++)
    {
      wts[i] = scn.nextInt();
    }


    int cap = scn.nextInt(); // bag capcity

    int[] dp = new int[cap + 1];
    dp[0] = 0;

    for (int bagc = 1; bagc < = cap; bagc++)
    {


      int max = 0;
      for (int i = 0; i < n; i++)
      {

        if (wts[i] < = bagc)
        {
          int rbagc = bagc - wts[i];
          int rbagv = dp[rbagc];
          int tbagv = rbagv + values[i];

          if (tbagv > max)
          {
            max = tbagv;
          }
        }
      }
      dp[bagc] = max;

      
    }
    System.out.println(dp[cap]);
  }
}