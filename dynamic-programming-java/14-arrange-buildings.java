// Suppose you are given a number n, which represents the length of a road. The road has n plots on each side. The road is to be so planned that there should not be consecutive buildings on either side of the road.

// You are required to find and print the number of ways in which the buildings can be built on both sides of roads.

import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    long n = scn.nextInt();

    long ob = 1;
    long os = 1;
    for (int i = 2; i <= n; i++) {
      long nb = os;
      long ns = os + ob;

      ob = nb;
      os = ns;
    }
    int total = ob + os;
    System.out.println(total * total);
  }

}