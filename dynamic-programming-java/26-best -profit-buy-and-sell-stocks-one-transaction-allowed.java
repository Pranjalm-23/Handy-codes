/* 
You are given an array of n elements. Element at index i represents a stock value on ith day.
You need to print the maximum profit you can make if you are allowed a single transaction.
A transaction refers to buying a stock on a given day, and selling it on a day in future.
Thus the profit of buying the stock will be the price of stock on the day of selling minus the price of stock on the day of buying.
Nobody will laugh at you, if you didn't know this! It is very trivial, but still, I want to let you know that you cannot sell a stock before buying it! You cannot have a state "SB".
 */

import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }

    int msf = arr[0]; // min so far
    int op = 0; // overall profit
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < msf) {  // price of day < min
        msf = arr[i];
      }

      int cp = arr[i] - msf;
      if (cp > op) {
        op = cp;
      }
    }

    System.out.println(op); // max profit possible
  }

}