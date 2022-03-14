import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    scan.close();
    printIncreasing(n);
  }

  public static void printIncreasing(int n) {
    if (n == 0) {
      return;
    }
    System.out.println(n);
    printIncreasing(n - 1);
    System.out.println(n);
  }

}