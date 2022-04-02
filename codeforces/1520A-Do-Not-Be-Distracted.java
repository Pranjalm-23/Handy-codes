import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int n  = scan.nextInt();
    int[] days = new int[n];
    String[] sequence = new String[n];
    for(int i =0; i < n; i++){
    days[i] = scan.nextInt();
    sequence[i] = scan.next();
    }
    scan.close();
    for(int i = 0; i < n; i++){
        check(days[i], sequence[i]);
    }
    
  }

  public static void check (int length, String sequence) {
      if(length == 1 && sequence.length() == 1){
          System.out.println("YES\n");
      } else {
          int[] count = new int[26];
          for(int j=0; j < sequence.length(); j++){
              char ch = sequence.charAt(j);
              count[ch - 'A']++;
              if(count[ch - 'A'] > 1 && sequence.charAt(j-1) != ch){
                  System.out.println("NO\n");
                  return;
              }
              
          }
          System.out.println("YES");
          return;
      }
    
}
}