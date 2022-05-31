import java.util.*;


public class Main {

  public static void main(String[] args) {

    // stringbuilder is faster to work with the 
    // strings so prefer it when required
    StringBuilder sb = new StringBuilder("Hello");
    System.out.println("String : " + sb);

    // length
    System.out.println("Length of string : " + sb.length());

    // charAt
    System.out.println("First character : " + sb.charAt(0));

    // setCharAt
    sb.setCharAt(0, 'h');
    System.out.println("String : " + sb);

    // append
    sb.append(" reader");
    System.out.println("String : " + sb);

    // insert
    sb.insert(2, "pkm");
    System.out.println("String : " + sb);

    // deleteCharAt
    sb.deleteCharAt(5);
    System.out.println("String : " + sb);

    // delete
    sb.delete(0, 5);
    System.out.println("String : " + sb);

    // replace
    sb.replace(4, 6, "ing");
    System.out.println("String : " + sb);

    // toString
    String str = sb.toString();
    System.out.println("String : " + str);
  }
}

long time = System.currentTimeMillies(); // to check the time when this line runs