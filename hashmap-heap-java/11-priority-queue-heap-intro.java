// As it has Queue in its name, so it becomes a little evident that the Priority Queue also has a structure as that of a Queue.
// Similarities:
// The name and the work of the functions of the Priority Queue are the same as that of Queue; add(), remove(), and peek().
// add() function add an element to the Priority Queue.
// remove() function removes an element from the Priority Queue.
// peek() function returns the value of an element of the Priority Queue.
// Differences:
// When an element is removed from the Priority Queue, a certain "Priority" is followed. We can set this priority according to our needs.
// We have two options to do so; we can either set it to rank order i.e. number with highest rank (lowest in value) or to score order i.e. number with highest score (greatest in value).
// By default this priority is set to rank order (smaller val -> hi priority). That means if you call remove() function then the number with lowest value will be removed from the Priority Queue.
// Same is the case for the peek() function. It also returns the value of the element with highest priority.
// Unlike Queue, the add() and the remove() functions in the Priority Queue have a time complexity of O(log n).
// You should watch this part of the lecture video for more clarity.

// peek   o1
// add, remove logn
// internal arrangement uncontrollable

import java.io.*;

import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    PriorityQueue< Integer> pq = new PriorityQueue< >();  // smaller val high priority

    int[] ranks = {22, 99, 3, 11, 88, 4, 1};

    for (int i : ranks) {
      pq.add(i);
    }
    while (pq.size() > 0) {
      System.out.println(pq.peek());
      pq.remove();
    }


    PriorityQueue< Integer> priorq = new PriorityQueue< >(Collections.reverseOrder());  // larger val high priority
    
    int[] ranks1 = {23, 109, 4033, 110, 88, 4, 1};
    for (int val : ranks1) {
      priorq.add(val);
    }
    while (priorq.size() > 0) {
      System.out.println(priorq.peek());
      priorq.remove();
    }
    
  }
}