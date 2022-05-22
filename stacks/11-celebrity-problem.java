import java.io.*;
import java.util.*;

public class Main {
  //stack can be used to optimise n^2 to n order of complexity

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);

    }

    public static void findCelebrity(int[][] arr) {
        // if a celebrity is there print it's index (not position), if there is not then
        // print "none"

        // pushing every person to stack
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            st.push(i);
        }
        while(st.size() >= 2){
            int i = st.pop();
            int j = st.pop();
            
            if(arr[i][j] == 1){
                // if: i knows j => i is not celebrity 
                st.push(j);
            } else {
                // if: i doesn't know j => j is not celebrity
                st.push(i);

            }
        }

        int potentiallyCelebrity = st.pop();
        for(int i = 0; i < arr.length; i++){
            // check if i is a celebrity
            if(i != potentiallyCelebrity){

                if(arr[i][potentiallyCelebrity] == 0 || arr[potentiallyCelebrity][i] == 1){
                    System.out.println("none");
                    return;                    
                }

            }
        }
        // to be run iff its a celebrity else it would have been 
        System.out.println(potentiallyCelebrity);
        
    }

}