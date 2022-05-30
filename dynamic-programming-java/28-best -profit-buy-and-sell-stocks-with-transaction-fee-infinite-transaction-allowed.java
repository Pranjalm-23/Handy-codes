/* 
You are given an array of n elements. Element at index i represents a stock value on ith day.
You are also given a number 'fee' representing the transaction fee for every transaction.
You need to print the maximum profit you can make if you are allowed infinite transactions, but have to pay a "fee" for every complete transaction.
Note - There can be no overlapping transaction. One transaction needs to be closed (a buy followed by a sell) before opening another transaction (another buy). We cannot first buy 2 stocks and then sell them, i.e. states like 'BBSS' are not allowed.

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
    int fee = Integer.parseInt(br.readLine());

    int bstp = -arr[0];   // best bought state
    int sstp = 0;       // best sold state total profit


    for (int i = 1; i < arr.length; i++) {
      int nsstp = 0;
      int nbstp = 0;
      // for new bought state
      if (sstp - arr[i] > bstp) {  // if better than old buy state
        nbstp = sstp - arr[i];
      } else {
        nbstp = bstp;
      }

      // for new sold state
      if (bstp + arr[i] - fee > sstp) { //if new sold state better
        nsstp = bstp + arr[i] - fee;
      } else {
        nsstp = sstp;
      }

      bstp = nbstp;
      sstp = nsstp;
    }

    System.out.println(sstp);
  }

}