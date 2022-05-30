// You are given a binary array of size n. Binary array refers to an array with all elements being either 0 or 1. You have to sort the array, i.e. place all the zeros before all the ones.

// Note: You are not required to write a stable sort algorithm. It means that the 0's need can be arranged in any order among themselves, and similarly 1's can be in any order among themselves, but must be after 0's only.

import java.io.*;

import java.util.*;

public class Main {

  public static void sort01(int[] arr) {
    // 0 to j-1  ->  All Zeroes //
    // j to i-1  ->  All One's //
    /* i to arr.length-1 -> All unknowns */

    int i = 0, j = 0;
    while (i < arr.length) {
      if (arr[i] == 0) {
        swap(arr, i, j);
        i++;
        j++;
      } else {
        i++;
      }
    }
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping index " + i + " and index " + j);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr) {
    for (int i = 0 ; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0 ; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    sort01(arr);
    print(arr);
  }
}