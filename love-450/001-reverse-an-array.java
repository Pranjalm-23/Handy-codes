import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    int arrayLength = scan.nextInt();
    int[] arr = new int[arrayLength];
    for(int i = 0; i < arrayLength; i++){
      arr[i] = scan.nextInt();
    }
    scan.close();
    for(int i = 0; i < arrayLength/2; i++){
        int c= arr[i];
        arr[i] = arr[arrayLength-1-i];
        arr[arrayLength-1-i] = c;
    }

    for (int i = 0; i < arrayLength; i++)
      System.out.print(arr[i] + " ");
  }
}