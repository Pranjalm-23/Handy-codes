import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
       arr[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    // code
    Stack<Integer> st = new Stack<>();
    int[] nge = new int[arr.length]; //nge = next greater element

    st.push(arr.length-1);
    nge[arr.length-1] = arr.length;

    for(int i = arr.length - 2; i >= 0; i--){
      //-a+
      while(st.size() > 0 && arr[i] >= arr[st.peek()]){
        st.pop();
      }

      if(st.size() == 0){
        nge[i] = arr.length;
      } else {
        nge[i] = st.peek();
      }
      st.push(i);
    }

    // final result evaluation
    int j = 0;
    for(int i = 0; i <= arr.length - k; i++){
      // enter the loop to find the maximum of window starting at i
      if(j < i){
        j = i;
      }
      
      while(nge[j] < i + k){
        // check for the window of width k
        j = nge[j];
      }

      System.out.println(arr[j]);
      
    }

 }
}