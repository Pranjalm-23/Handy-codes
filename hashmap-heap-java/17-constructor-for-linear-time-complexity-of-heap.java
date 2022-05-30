// You are required to complete the code of our Priority Queue class using the heap data structure.
// Here is the list of functions that you are supposed to complete:

// add -> Should accept new data.
// remove -> Should remove and return smallest value, if available or print "Underflow" otherwise and return -1.
// peek -> Should return smallest value, if available or print "Underflow" otherwise and return -1.
// size -> Should return the number of elements available.


// HEAP: is a tree
// parent has higher priority than child
// complete binary tree property
// left child index = 2 * i + 1
// right child index = 2 * i + 2

// CBT -> Arraylist inplimentaion -> formulae valid -> parent swapping possible -> upheapify -> logn



import java.io.*;

import java.util.*;

public class Main {
  // add logn, remove logn,  peek o1
  public static class PriorityQueue {
    ArrayList< Integer> data;

    public PriorityQueue(int[] arr) {
      data = new ArrayList<>();
      for(int val: arr)
      {
        data.add(val);
      }
      for(int i = data.size() /2 -1; i >= 0; i--)
      {
        downheapify(i);
      }

    }

    public void add(int val) {
      data.add(val);
      upheapify(data.size() - 1);
    }

    private void upheapify(int i) {
      if (i == 0) {
        return;
      }

      int pi = (i - 1) / 2;
      if (data.get(pi) > data.get(i)) {
        swap(i, pi);
        upheapify(pi);
      }
    }

    private void swap(int i, int j) {
      int ith = data.get(i);
      int jth = data.get(j);
      data.set(i, jth);
      data.set(j, ith);
    }

    public int remove() {
      if (this.size() == 0) {
        System.out.println("Underflow");
        return -1;
      }
      swap(0, data.size() - 1);
      int val = data.remove(data.size() - 1);
      downheapify(0);
      return val;
    }

    private void downheapify(int pi) {
      int mini = pi;

      int li = 2 * pi + 1;
      if (li < data.size() && data.get(li) < data.get(mini)) {
        mini = li;
      }
      int ri = 2 * pi + 2;
      if (ri < data.size() && data.get(ri) < data.get(mini)) {
        mini = ri;
      }
      if (mini != pi) {
        swap(i, mini);
        downheapify(mini);
      }
    }

    public int peek() {
      if (this.size() == 0) {
        System.out.println("Underflow");
        return -1;
      }

      return data.get(0);
    }

    public int size() {
      return data.size();
    }
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PriorityQueue qu = new PriorityQueue();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}