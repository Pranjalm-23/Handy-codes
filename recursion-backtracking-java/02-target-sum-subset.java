import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] elements = new int[n];
        for ( int i=0; i< elements.length; i++){
            elements[i] = scan.nextInt();
        }
        int target = scan.nextInt();
        scan.close();
        printTargetSumSubsets(elements, 0, "", 0, target);
    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
      if(idx == arr.length){
        if(sos == tar){
          System.out.println(set + ".");
        }
        return;
      }
      // included
      printTargetSumSubsets(arr, idx + 1, set + arr[idx] +", ", sos + arr[idx], tar);
      // not included
      printTargetSumSubsets(arr, idx + 1, set, sos, tar);

    }

}