// You are given 2 arrays a1 and a2 of size n1 and n2 respectively.

// You are required to print all the elements of a2 which are also present in a1 (in order of their occurence in a2).

// Make sure to not print duplicates (a2 may have the same value present multiple times).

CODE

import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int[]a1 = new int[n1];
    for (int i = 0; i hm = new HashMap();
    for (int val : a1)
    {
      if (hm.containsKey(val)) {
          int old = hm.get(val);
          int now = old + 1;
          hm.put(val, now);
        }
        else
        {
          hm.put(val, 1);
        }
      }

    for (int val : a2) {
    if (hm.containsKey(val))
      {
        System.out.println(val);
        hm.remove(val);
      }
    }

  }

}