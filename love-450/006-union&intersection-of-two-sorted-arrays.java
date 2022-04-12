import java.io.*;
import java.util.*;
public class Main {
  public static void main(String[] args) throws Exception {
    
    Scanner scan = new Scanner(System.in);
    int arrayLength1 = scan.nextInt();
    int[] arr1 = new int[arrayLength1];
    
Set<Integer> union = new HashSet<Integer>();
    for(int i = 0; i < arrayLength1; i++){
      arr1[i] = scan.nextInt();
      union.add(arr1[i]);
    }
Set<Integer> intersection = new HashSet<Integer>();
    int arrayLength2 = scan.nextInt();
    int[] arr2 = new int[arrayLength2];
    
    for(int i = 0; i < arrayLength2; i++){
      arr2[i] = scan.nextInt();
      if(union.contains(arr2[i])) intersection.add(arr2[i]);
      union.add(arr2[i]);
    }
    scan.close();

  
    System.out.println(union);
    System.out.println(intersection);

  }
 
}