/* 
We are given a string that contains only lowercase and uppercase alphabets.
We have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.
For "abecd", the answer should be "a1b3e-2c1d"
 */

import java.io.*;

import java.util.*;

public class Main {
  public static String solution(String str) {
    StringBuilder sb = new StringBuilder();
    sb.append(str.charAt(0));

    for (int i = 1; i < str.length(); i++) {
      char curr = str.charAt(i);
      char prev = str.charAt(i - 1);

      int gap = curr - prev;

      sb.append(gap);
      sb.append(curr);
    }
    return sb.toString();
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    System.out.println(solution(str));
  }
}