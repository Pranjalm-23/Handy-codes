import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverlappingIntervals(arr);
    }

    public static void mergeOverlappingIntervals(int[][] arr) {
        // merge overlapping intervals and print in increasing order of start time
        Interval[]  pairs = new Interval[arr.length];
        for(int i = 0; i < arr.length; i++){
            pairs[i] = new Interval(arr[i][0], arr[i][1]);
        }

        Arrays.sort(pairs); //will be sorted according to st
        Stack<Interval> st = new Stack<>();
        for(int i = 0; i < pairs.length; i++){
          if(i == 0){
            st.push(pairs[i]);
          }else{
            Interval top = st.peek();
            
            if(pairs[i].st > top.et){
              st.push(pairs[i]);
            }else {
              top.et = Math.max(top.et, pairs[i].et);
            }
          }
        }
        Stack<Interval> resultStack = new Stack<>();
        while(st.size() > 0){
          resultStack.push(st.pop());
        }

        while(resultStack.size() > 0){
          Interval p = resultStack.pop();
          System.out.println(p.st + " " + p.et);
          
        }
    }

    public static class Interval implements Comparable<Interval> {
      int st;
      int et;
      Interval(int st, int et){
        this.st = st;
        this.et = et;
      }
      // this > other return +ve
      // this < other return -ve
      // this = other return 0
      public int compareTo(Interval other){
        if(this.st != other.st){
          return this.st - other.st;
        } else {
          return this.et - other.et;
        }
      }
    }

}