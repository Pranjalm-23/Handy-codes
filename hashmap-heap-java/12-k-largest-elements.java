// First of all, as input, you will be given a number n, representing the size of array a then following n numbers, representing elements of array a. You are also given a number k.

// All you have to do is, find and print the k largest elements of the array in increasing order.

// Input is managed for you.

// Check out the example below for better understanding.

// Sample Input: 13 12 62 22 15 37 99 11 37 98 67 31 84 99 4

// Implies: n = 13

// a = 62 22 15 37 99 11 37 98 67 31 84 99

// Sample Output: 84 98 99 99

import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }

    int k = Integer.parseInt(br.readLine());

    PriorityQueue pq = new PriorityQueue <>();
    for (int i = 0; i < arr.length; i++) {
      if (i < k) {
        pq.add(arr[i]);
      } else {
        if (arr[i] > pq.peek()) {
          pq.remove();
          pq.add(arr[i]);
        }
      }
    }

    while (pq.size() > 0) {
      System.out.println(pq.remove());
    }
  }

}