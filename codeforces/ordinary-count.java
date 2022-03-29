import java.util.*;

import java.lang.*;
import java.io.*;

class Main
{
  public static void main (String[] args) throws java.lang.Exception
  {
    Scanner scan  = new Scanner(System.in);
    int t = scan.nextInt();
    int[] n = new int[t];
    for(int i = 0; i < t; i++){
        n[i] = scan.nextInt();
    }
    scan.close();
    
    for(int i = 0; i < t; i++){
        ordinaryNoCount(n[i]);
    }
    
  }
  public static void ordinaryNoCount(int n){
      int count = 0;
      for(int j = 1; j < n; j++){
          
          int[] digits = new int[];
          
          int placeFromRight = 0;
          
          // getting the digits
          while(j != 0){
              digits[placeFromRight] = j % 10;
              j = j/10;
              placeFromRight++;
          }
          
          //check if all digits are equal
          int areEqual = 1;
          for( int i=0; i< digits.length - 1; i++){
            if (data[x] != data[x+1]){
            areEqual = 0;            
            }
        }
        
        // increase count of ordinary numbers
        if(areEqual == 1){
            count++;
        }       
          
      }

      System.out.println(count);
      
  }
}