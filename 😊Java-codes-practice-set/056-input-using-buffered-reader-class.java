import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
  public static void main(String[] args) {

    // input data using BufferedReader
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    // rewading data using readLine
    String name = reader.readLine();

    System.out.println(name);
    
  }
}