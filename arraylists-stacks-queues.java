// same as vector in c++

//Arraylist. It is another data-structure, just like an array (but very different). In Java, the developers have written a class for Arraylist and it's methods. Therefore, it is also called the "Arraylist class" many times.

// We say that it is a data-structure, which is a collection of similar data-types which are arranged in a contiguous memory.

import java.util.*;

public class Main {


  public static void main(String[] args) {

    //////////////////////////////////////// Arraylist ///////////////////////////////////////////////

    ArrayList< Integer> al = new ArrayList< >(); //declares an integer arraylist
    Arraylist< String> a2 = new Arraylist < >(); //declares an arraylist of string

    // size
    System.out.println(a1.size());

    a1.add(10);
    a1.add(20);
    a1.add(30);
    a1.add(1, 1000); // adds 1000 at index 1

    System.out.print(a1);  //prints the entire list at one go

    for (int x : a1)
    {
      System.out.println(x); //each element belonging to a1 will get printed
    }

    int val = a1.get(1); //gets the value at index 1
    val = 10;

    for (int i = 0; i < a1.size(); i++)
    {
      System.out.println(a1.get(i));  //printing using get()
    }

    a1.set(1, 2000); //changes the value at index 1 to 2000;

    a1.remove(1) //removes the value at index 1




    //////////////////////////////////////// stacks //////////////////////////////////////////////
    Stack<Integer> st = new Stack<>();
    st.push(10);
    st.push(20);
    st.push(30);

    System.out.println(st);

    System.out.println(st.peek());

    System.out.println(st.pop());

    System.out.println(st);




    
    ///////////////////////////////////////// QUEUES ////////////////////////////////////

    ArrayDequeue<Integer> que = new ArrayDequeue<>();
    que.addLast(20);
    que.addLast(34);
    que.addLast(84);

    System.out.println(que);

    System.out.println(que.getFirst());
    
    System.out.println(que.removeFirst());

    System.out.println(que);
    
    
    
    
    

  }

}