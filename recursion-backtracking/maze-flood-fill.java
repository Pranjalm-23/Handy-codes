import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        scn.close();
        //to keep track of visited cells so that we don't go back to the same cell
        boolean[][] visited = new boolean[n][m];
        floodfill(arr, 0, 0, "",visited);
    }
    
    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String path, boolean[][] visited) {
      if(sr < 0 || sc < 0 || sr == maze.length || sc == maze[0].length || maze[sr][sc] == 1 || visited[sr][sc] == true) {
        return;
      }

      if(sr == maze.length - 1 && sc == maze[0].length - 1) {
        System.out.println(path);
      }
      visited[sr][sc] = true;
      floodfill(maze,sr-1, sc, path+"t",visited);
      floodfill(maze,sr, sc-1, path+"l",visited);
      floodfill(maze,sr+1, sc, path+"d",visited);
      floodfill(maze,sr, sc+1, path+"r",visited);
      visited[sr][sc] = false; // removing so that others can use the blank cells to find the paths, otherwise only one path will make the whole path visited

    }
}
