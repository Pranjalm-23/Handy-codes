//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}// } Driver Code Ends


//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        char[] arr = str.toCharArray();
        int n = arr.length;
   
        for(int i = 0; i<n/2; i++) {
           char temp = arr[i];
           arr[i] = arr[n-1-i];
           arr[n-1-i] = temp;
        }
        return String.valueOf(arr);
    }
}