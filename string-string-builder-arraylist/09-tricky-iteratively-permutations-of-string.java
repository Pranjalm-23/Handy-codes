/* 
Permutations of "abc" are:

abc
bac
cab
acb
bca
cba
"abc" has 6 permutations. A general formula for permutations is n! (factorial of n) where n is the length of the string.

NOTE: We are assuming all the characters are unique.
 */

  // visit: https://www.pepcoding.com/resources/online-java-foundation/string,-string-builder-and-arraylist/print_all_permutations_of_a_string_iteratively/topic

import java.io.*;

import java.util.*;

public class Main {

  public static void solution(String str) {
    int len = str.length();
    int total = factorial(len);

    for (int number = 0; number < total; number++) {
      StringBuilder sb = new StringBuilder(str);
      int temp = number;

      for (int divisor = len; divisor >= 1; divisor--) {
        int q = temp / divisor;
        int r = temp % divisor;

        System.out.print(sb.charAt(r));
        sb.deleteCharAt(r);
        temp = q;
      }
      System.out.println();
    }
  }

  public static int factorial(int n) {
    int fact = 1;
    for (int i = 2; i <= n; i++) {
      fact *= i;
    }
    return fact;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();

    solution(str);
    scn.close();
  }

}