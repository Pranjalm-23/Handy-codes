import java.util.*;

import java.lang.*;
import java.io.*;

public class Main
{
  public static void main (String[] args) throws java.lang.Exception
  {
    Scanner scan  = new Scanner(System.in);
    int t = scan.nextInt();
    int k = 0;
    for(int i = 0; i < t; i++){
        k = scan.nextInt();
        noOfStepsRequired(k);
    }
    scan.close();
  }
  
  public static void noOfStepsRequired(int k){
    // if  k= multiple of any of factors of 100, then steps are reduced
    // factors of 100: 100, 50, 25, 20, 10, 5, 1
    int steps = 0;
    
    if(k== 100){
        steps = 1;
    } else if(k % 50 == 0){
        steps = 2;   // 100/50
    }else if(k % 25 == 0){
        steps = 4;  // 100/25
    } else if(k % 20 == 0){
        steps = 5;
    }else if(k % 10 == 0){
        steps = 10;
    }else if(k % 5 == 0){
        steps = 20;
    }else if(k % 4 == 0){
        steps = 25;
    }else if(k % 2 == 0){
        steps = 50;
    }else if(k % 1 == 0){
        steps = 100;
    }
   
      System.out.println(steps);
      
  }
  
 
}