import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    scan.close();
    int[][] chessboard = new int[n][n];
    printNQueens( chessboard, "", 0);
  }

  // qsf = queens so far
  public static void printNQueens(int[][] chess, String qsf, int row) {
    if (row == chess.length) {
      System.out.println(qsf + ".");
      return;
    }
     // levels = parameter, options as loops
    for (int col = 0; col < chess.length; col++) {
      if (isItSafePlaceForTheQueen(chess, row, col) == true) {

        chess[row][col] = 1;
        printNQueens(chess, qsf + row + "-" + col + ", ", row + 1);
        chess[row][col] = 0;

      }
    }
  }

  public static boolean isItSafePlaceForTheQueen(int[][] chess, int row, int col) {
    //check for vertically up
    for (int i = row - 1, j = col; i >= 0; i--) {
      if (chess[i][j] == 1) {
        return false;
      }
    }
    // check for diagonal towards top-left
    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
      if (chess[i][j] == 1) {
        return false;
      }
    }

    // check for diagonal towards top-right
    for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
      if (chess[i][j] == 1) {
        return false;
      }
    }
    return true;

  }
}