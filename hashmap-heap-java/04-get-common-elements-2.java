// You are given 2 arrays a1 and a2 of sizes n1 and n2 respectively.

// You are required to find the intersection of a1 and a2 as seen in figure 1.

// Don't assume the arrays to be sorted.

// The elements of intersection should be printed in order of their occurence in a2.

import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {

    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int[]a1 = new int[n1];
    for (int i = 0; i < n1; i++)
    {
      a1[i] = scn.nextInt();
    }
    int n2 = scn.nextInt();
    int[]a2 = new int[n2];
    for (int i = 0; i < n2; i++)
    {
      a2[i] = scn.nextInt();
    }

    HashMap< Integer, Integer> hm = new HashMap();
    for (int val : a1)
    {
      // inserting array 1
      if (hm.containsKey(val)) {
        int old = hm.get(val);
        int now = old + 1;
        hm.put(val, now);
      }
      else {
        hm.put(val, 1);
      }
    }



    for (int val : a2) {
      if (hm.containsKey(val)) {
        System.out.println(val);
        int old = hm.get(val);
        if (old > 1)
          hm.put(val, old - 1);
        else
          hm.remove(val);
      }
    }

  }

}