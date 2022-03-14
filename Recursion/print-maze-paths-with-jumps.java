import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int m = scan.nextInt();
      scan.close();
      printMazePaths(1,1,n,m,"");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String path) {

      if(sr == dr && sc == dc){
        System.out.println(path);
        return;
      }
        
      //horizontal move 
      for(int ms = 1; ms <= dc-sc; ms++){
        printMazePaths(sr,sc+ms,dr,dc,path+"h"+ms);
      }

      //vertical
      for(int ms = 1; ms <= dr-sr; ms++){
        printMazePaths(sr+ms,sc,dr,dc,path+"v"+ms);
      }

      //diagonal
      for(int ms = 1; ms <= dc-sc && ms<=dr-sr; ms++){
        printMazePaths(sr+ms,sc+ms,dr,dc,path+"d"+ms);
      }
    }

}