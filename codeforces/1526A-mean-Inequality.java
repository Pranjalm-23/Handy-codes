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
        int[] a = new int[2*n];
        // input the values
        for(int p = 0; p < 2*n; p++){
            a[p] = scan.nextInt();
        }
        
        generateMeanInequal(a, n);
        
        
    }
    
  }
  
  public static void generateMeanInequal(int[] arr, int n){
      Arrays.sort(arr);
      
      for(int i = 0; i < n; i++){
      System.out.print(arr[i] + " " +arr[i+n] + " ");
    }
    System.out.println("");
      
  }
  
}