import java.util.*;

public class Main{

  public static void main(String[] args)  {
    Scanner scan = new Scanner(System.in);

    int n1 = scan.nextInt();
    int[] arr1 = new int[n1];
    for(int i = 0; i < arr1.length; i++){
      arr1[i] = scan.nextInt();
    }

    int n2 = scan.nextInt();
    int[] arr2 = new int[n2];
    for(int i = 0; i < arr2.length; i++){
      arr2[i] = scan.nextInt();
    }

    scan.close();
    
    int[] sum = new int[n1 > n2 ? n1 : n2];
    int carry = 0;
   

    int i = arr1.length-1;
    int j = arr2.length-1;
    int k = sum.length-1;


    while(k >= 0){
      int d = carry;

      int a1val = i >= 0 ? arr1[i] : 0;
      int a2val = j >= 0 ? arr2[j] : 0;

      if(i >= 0) {
        d += a1val;
      }

      if(j >= 0) {
        d += a2val;
      }

      carry = d / 10;
      d = d % 10;

      sum[k] = d;

      i--;
      j--;
      k--;

    }    

    if(carry != 0){
      System.out.println(carry);
      
    }

    for(int val: sum){
      System.out.println(val);
      
    }

  }
}


// problem with this code is works rightly when n1 = n2