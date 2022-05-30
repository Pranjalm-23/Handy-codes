
// You are given an array of n elements. Element at index i represents a stock value on ith day.
// You are required to print the maximum profit you can make if you are allowed infinite transactions, but we have a cooldown period for 1 day between selling stock and buying new stock.
// It means that if we had sold a stock yesterday, then we cannot buy the new stock today, we will have to remain in a cooldown state for 1 day and hence can buy new stock tomorrow (or any day after tomorrow) only.
// Hence, you cannot buy on the next day after you sell, you have to cooldown for a day at-least before buying again.
// Note - There can be no overlapping transaction. One transaction needs to be closed (a buy followed by a sell) before opening another transaction (another buy). We cannot first buy 2 stocks and then sell them, i.e. states like "BBSS" are not allowed


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

    int bstp = -arr[0]; // best buy state
    int sstp = 0;  // best sold state
    int cstp = 0;  // best cooldown state

    for (int i = 1; i < arr.length; i++) {
      int nbstp = 0;  // new best buy state
      int nsstp = 0;
      int ncstp = 0;

      // for new bought state   --    we can go to buy state only after cooldown state
      if (cstp - arr[i] > bstp) {
        nbstp = cstp - arr[i];
      } else {
        nbstp = bstp;
      }

      // for new sold state
      if (bstp + arr[i] > sstp) {
        nsstp = bstp + arr[i];
      } else {
        nsstp = sstp;
      }

      // for cooldown state
      if (sstp > cstp) {
        ncstp = sstp;
      } else {
        ncstp = cstp;
      }

      bstp = nbstp;
      sstp = nsstp;
      cstp = ncstp;
    }

    System.out.println(Math.max(sstp, cstp));
  }

}