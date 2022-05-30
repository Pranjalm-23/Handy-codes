/* 
You are given an array of n elements. Element at index i represents a stock value on ith day.
You need to print the maximum profit you can make if you are allowed infinite transactions.
Note - There can be no overlapping transactions. One transaction needs to be closed (a buy followed by a sell) before opening another transaction (another buy). We cannot first buy 2 stocks and then sell them, i.e. states like 'BBSS' are not allowed.
Nobody will laugh at you, if you didn't know this! It is very trivial, but still, I want to let you know that you cannot sell a stock before buying it! You cannot have a state "SB".
 */

import java.io.*;

import java.util.*;
// all upstocks are to be added to get the answer

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }

    int bon = 0; // buy-day idx
    int son = 0; // sell-day idx
    int op = 0; // total profit till now
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < arr[i - 1]) {  // price down
        op += arr[son] - arr[bon];
        bon = son = i;
      } 
      // price rise or stable
      else {
        son++;
      }
    }

    op += arr[son] - arr[bon];
    System.out.println(op);
  }

}