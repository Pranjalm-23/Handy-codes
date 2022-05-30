import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        } else if(n<0) {
            ArrayList<String> baseResult = new ArrayList<>();
            // no element in the array implies no ways will be handy for the solution
            return baseResult;
        }


       ArrayList<String> paths1 = getStairPaths(n-1);
       ArrayList<String> paths2 = getStairPaths(n-2);
       ArrayList<String> paths3 = getStairPaths(n-3);

       ArrayList<String> paths = new ArrayList<>();

        for(String path:paths1){
            paths.add(1+ path);
        }

        for(String path:paths2){
            paths.add(2+ path);
        }

        for(String path:paths3){
            paths.add(3+ path);
        }

       return paths;
    }

}