import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {

    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    HashMap < Character, Integer> hm = new HashMap(); 
    for (int i = 0; i < str.length(); i++)
    {
      char ch = str.charAt(i);
      if (hm.containsKey(ch)) 
      {
        int old = hm.get(ch);
        int now = old + 1;
        hm.put(ch, now);
      }
      else {  
        hm.put(ch, 1);
      }

    }

    char max = str.charAt(0); 
    for (Character key : hm.keySet()) 
    {
      if (hm.get(key) > hm.get(max))
        max = key;

    }
    System.out.println(max);  
  }

}