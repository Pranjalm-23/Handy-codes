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
    int k = scan.nextInt();
    scan.close();
    Arrays.sort(arr);
    int kth_max = arr[arrayLength-1 -(k-1)],
        kth_min = arr[k-1];

    
        System.out.println(k+"th-Maximum :" + kth_max + "\n"+k+"th-Minimum :" + kth_min);

    
  }
}