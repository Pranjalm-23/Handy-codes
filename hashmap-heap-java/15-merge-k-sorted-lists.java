import java.io.*;

import java.util.*;

public class Main {

  public static class Pair implements Comparable< Pair> {
    int li; //list index
    int di; // data index in the list
    int data;

    Pair(int li, int di, int data) {
      this.li = li;
      this.di = di;
      this.data = data;
    }

    public int compareTo(Pair o) {
      return this.data - o.data; // smaller val is given priority
      // +ve   ==> this is greater
      // -ve   ==> this is smaller
      // 0  ==> are equal

    }
  }

  public static ArrayList< Integer> mergeKSortedLists(ArrayList< ArrayList< Integer>> lists) {
    ArrayList< Integer> rv = new ArrayList<>();  // merged list

    PriorityQueue< Pair> pq = new PriorityQueue<>();


    for (int i = 0; i < lists.size(); i++) {
      Pair p = new Pair(i, 0, lists.get(i).get(0));
      pq.add(p);
    }

    while (pq.size() > 0) {
      Pair p = pq.remove();
      rv.add(p.data);
      p.di++; // to get the index of next elemnt in the same list

      if (p.di < lists.get(p.li).size()) {
        p.data = lists.get(p.li).get(p.di);
        pq.add(p); // adding the next element of the same list
      }
    }

    return rv;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int k = Integer.parseInt(br.readLine());
    ArrayList< ArrayList< Integer>> lists = new ArrayList<>();
    for (int i = 0; i < k; i++) {
      ArrayList< Integer> list = new ArrayList<>();

      int n = Integer.parseInt(br.readLine());
      String[] elements = br.readLine().split(" ");
      for (int j = 0; j < n; j++) {
        list.add(Integer.parseInt(elements[j]));
      }

      lists.add(list);
    }

    ArrayList< Integer> mlist = mergeKSortedLists(lists);
    for (int val : mlist) {
      System.out.print(val + " ");
    }
    System.out.println();
  }

}