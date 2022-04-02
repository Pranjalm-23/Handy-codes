import java.util.*;
import java.util.Arrays;

import java.lang.*;
import java.io.*;

public class Main
{
  public static void main (String[] args) throws java.lang.Exception
  {
    Scanner scan  = new Scanner(System.in);
    int t = scan.nextInt(); // no of testcases
    
    for(int i = 0; i < t; i++){
        // size of 
        int n = scan.nextInt();
        int[] a = new int[n];
        // input the values
        for(int p = 0; p < n; p++){
            a[p] = scan.nextInt();
        }
        
        findGoodPair(a, n);
        
        
    }
    
  }
  
  public static void findGoodPair(int[] arr, int n){
      int[] a = new int[n];
      for(int k=0; k < n; k++){
          a[k] = arr[k];
      }
      
      Arrays.sort(a);
      
      int idx1 = findIdx(arr, n, a[n-1]);
      int idx2 = findIdx(arr, n, a[0]);
      idx1++; idx2++;
      System.out.println(idx2+" "+idx1);
  }
  
  public static int findIdx(int[] arr, int n, int val){
      for(int j = 0; j < n; j++){
          if(arr[j] == val) return j;
      }
      return -1;
  }
  
}