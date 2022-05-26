import java.util.*;

// saddle point: min in row and max in cloumn
public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[][] arr = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = scn.nextInt();
      }
    }
    int colno = 0, min = 0;
    for (int i = 0; i < n; i++) {   // rows
      min = arr[i][0];
      for (int j = 0; j < n; j++) {   // columns
        if (min > arr[i][j]) {
          min = arr[i][j];
          colno = j;
        }
      }
      boolean potentialAns = true;
      for (int r = 0; r < n; r++) {
        if (min < arr[r][colno]) {
          potentialAns = false;
          break;
        }
      }
      if (potentialAns == true) {
        System.out.print(min);
        return;
      }
    }
    System.out.print("Invalid Input");
  }
}