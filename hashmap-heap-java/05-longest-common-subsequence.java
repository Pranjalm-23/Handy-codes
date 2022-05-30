// You are given n numbers, representing elements of array a.
// In case there are two sequences of equal length (and they are also the longest), then print the one for which the starting point of which occurs first in the array.
// Say, the input array is as shown in figure 1
// 10 5 9 1 11 8 6 15 3 12 2
// From the above array, the following consecutive sequences can be formed:
// 1 2 3
// 5 6
// 8 9 10 11 12
// 15
// Out of all these sequences, the longest sequence is 8-9-10-11-12 of 5 elements. Hence this should be our output.

import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[]a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = scn.nextInt();
    }


    HashMap < Integer, Boolean> hm = new HashMap();
    for (int val : a) {
      hm.put(val, true); // put true for al at the start
    }


    for (int val : a) {
      if (hm.containsKey(val - 1)) { // if just smaller exists
        hm.put(val, false); // then make that false
      }
    }



    int mh = 0;
    int mval = 0;
    for (int val : a) {
      if (hm.get(val) == true)
      {
        int lh = 1;
        int lval = val;
        while (hm.containsKey(lval + lh)) {
          lh++;
        }
        if (lh > mh) {
          mh = lh;
          mval = val;
        }
      }
    }
    for (int i = 0; i < mh; i++)
    {
      System.out.println(mval + i);

    }
  }
}