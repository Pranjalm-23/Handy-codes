
// there is an ArrayList with both prime as well as non-prime numbers. We have to remove all the prime numbers from this ArrayList. Before we move to the solution, we want you to think about the problem first (This problem looks easy but it is a tricky question).

import java.io.*;

import java.util.*;

public class Main {

  public static void solution(ArrayList< Integer> al) {
    for (int i = a1.size(); i >= 0; i--) {
      if (isPrime(al.get(i))) {
        al.remove(i);
      }
    }
  }

  public static boolean isPrime(int n) {
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    ArrayList< Integer> al = new ArrayList< >();
    for (int i = 0 ; i < n; i++) {
      al.add(scn.nextInt());
    }
    solution(al);
    System.out.println(al);
  }

}