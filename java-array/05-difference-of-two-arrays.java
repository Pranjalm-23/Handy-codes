import java.util.*;
// arr2 - arr1

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
    
    int[] difference = new int[n1 > n2 ? n1 : n2];
    int carry = 0;

    int i = arr1.length-1;
    int j = arr2.length-1;
    int k = difference.length-1;

    while(k >= 0){
      int d = 0;
      int a1val = i >= 0 ? arr1[i] : 0;

      if(arr2[j] + carry >= a1val){
        d = arr2[j] + carry - a1val;
        carry = 0;
      } else{
        d = arr2[j] + carry + 10 - a1val;
        carry = -1;
      }

      difference[k] = d;

      i--;
      j--;
      k--;

    }


    }    

    int idx = 0;
    while(idx < diff.length){
      if(difference[idx] == 0){
        idx++;
      } else{
        break;
      }
    }

  while(idx < difference.length){
    System.out.println(difference[idx]);
    idx++;
  }
  }
