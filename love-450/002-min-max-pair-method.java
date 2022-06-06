import java.io.*;
import java.util.*;

public class Main {

  static class Pair{
    int min;
    int max;
  }

  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    int arrayLength = scan.nextInt();
    int[] arr = new int[arrayLength];
    for(int i = 0; i < arrayLength; i++){
      arr[i] = scan.nextInt();
    }
    scan.close();

    Pair minMax = getMinMax(arr, arrayLength);
    System.out.println("Maximum :" + minMax.max + "\nMinimum :" + minMax.min);
      
  }

  private static Pair getMinMax(int[] arr, int n) {
    Pair minMax = new Pair();
    
    int max = arr[0], min = arr[0];

    for(int i = 1; i < arrayLength; i++){
      if(minMax.max < arr[i]){
        minMax.max = arr[i];
      }

      if(minMax.min > arr[i]){
        minMax.min = arr[i];
      }
    }
    return minMax;
  }
}