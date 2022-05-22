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

    // code

      // finding boundaries for the elements.

    int[] rightBoundary = new int[arr.length]; // nse idx on the right
      // next smaller element on right

    Stack<Integer> st = new Stack<>();
    st.push(arr.length - 1); // default idx= array length, made the right boundary

    
    rightBoundary[arr.length - 1] = arr.length;
    for(int i = arr.length - 2; i >= 0; i--){

        while(st.size() > 0 && arr[i] <= arr[st.peek()]){
          st.pop(); // all greater elements popped
        }

        if(st.size() == 0){
          rightBoundary[i] = arr.length;
        }else{
          rightBoundary[i] = st.peek();   // saving the rb for this idx element
        }

        st.push(i);
    }



    int[] leftBoundary = new int[arr.length]; // nse idx on the left
    // next smaller element on left
    st = new Stack<>();
    st.push(0);
    leftBoundary[0] = -1; // smallest idx = -1 made the leftt boundary

    for(int i = 1; i < arr.length; i++){
        while(st.size() > 0 && arr[i] <= arr[st.peek()]){
          st.pop(); // all greater elements popped
        }
        if(st.size() == 0){
          leftBoundary[i] = -1;
        }else{
          leftBoundary[i] = st.peek();   // saving the lb for this idx element
        }
        st.push(i);
    }

        //area
    int maxArea = 0;
    for(int i = 0; i < arr.length; i++){
      int width = rightBoundary[i] - leftBoundary[i] - 1;
      int area = arr[i] * width;
      if(area > maxArea) {
        maxArea = area;
      }
    }
    System.out.println(maxArea);

 }
}