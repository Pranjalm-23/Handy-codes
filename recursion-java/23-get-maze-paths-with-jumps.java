import java.io.*;
import java.util.*;

//this program considers jumps to be valid in all three : h,v,d
public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int m = scan.nextInt();

      ArrayList<String> paths = getMazePaths(1,1,n,m);
      System.out.println(paths);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
      if(sr==dr && dc == sc){
        ArrayList<String> baseRes = new ArrayList<>();
        baseRes.add("");
        return baseRes;
      }

      ArrayList<String> paths = new ArrayList<>();

      //horizontral moves
      for(int ms=1; ms <= dc-sc; ms++){
        //ms=moveSize
        ArrayList<String> hpaths = getMazePaths(sr,sc + ms,dr,dc);
        for(String hpath:hpaths){
          paths.add("h"+ ms +hpath );
        }
      }

       // vertical moves
       for(int ms=1; ms <= dr-sr; ms++){
        //ms=moveSize
        ArrayList<String> vpaths = getMazePaths(sr+ms,sc ,dr,dc);
        for(String vpath:vpaths){
          paths.add("v"+ ms +vpath );
        }
      }

        // diagonal moves
        for(int ms=1; ms <= dr-sr && ms <= dc-sc ; ms++){
          ArrayList<String> dpaths = getMazePaths(sr+ms,sc+ms ,dr,dc);
          for(String dpath:dpaths){
            paths.add("d"+ ms +dpath );
          }
        }
        return paths;

    }

}