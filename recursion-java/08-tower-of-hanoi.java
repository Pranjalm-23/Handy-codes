// have faith that we have mechanism to move two discs as per conditions
// toh(2,A,C,B) ===moving two disk from A to C using Ba nd following the rules.
// toh knows steps for moving two disks

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int t1 = scan.nextInt();
    int t2 = scan.nextInt();
    int t3 = scan.nextInt();
    // n disks from tower 1 to tower 2 using tower 3
    toh(n, t1, t2, t3);  // put n disks from t1 to t2 with the help of t3
  }

  public static void toh(int n, int t1id, int t2id, int t3id) {
    if (n == 0) {
      return;
    }
    toh(n - 1, t1id, t3id, t2id);
    System.out.println(n + "[" + t1id + " -> " + t2id + "]");
    toh(n - 1, t3id, t2id, t1id);
  }

}