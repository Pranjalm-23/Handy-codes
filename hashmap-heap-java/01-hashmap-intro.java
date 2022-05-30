import java.io.*;

import java.util.*;

// most of the opr in O(1)
// for table of info
// O(1)
// order in which they are added can not be controlled


public class Main {

  public static void main(String[] args)
  {
    // creating a hashmap
    HashMap< String, Integer> hm = new HashMap< >();
    System.out.println(hm);

    hm.put("India", 1391);
    hm.put("China", 1398);
    hm.put("USA", 329);
    hm.put("Indonesia", 268);
    // order in which they are added can not be controlled

    //Printing the get(key) when key exists
    System.out.println("Value for India " + hm.get("India"));

    //Printing the get(key) when kkey doesn't exist
    System.out.println("Value for Utopia " + hm.get("Utopia"));

    System.out.println(hm.containsKey("India"));

    Set<String> keys = hm.keySet(hm);
    System.out.println(keys);
    
    for(String key: hm.keySet()){
      Integer val = hm.get(key);
      System.out.println(key + " " + val);
      
    }
    
  }
}