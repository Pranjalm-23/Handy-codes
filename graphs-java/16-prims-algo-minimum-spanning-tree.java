
// You are given a graph and a source vertex. The vertices represent computers and the edges represent the length of LAN wire required to connect them.
// You are required to find the minimum length of wire required to connect all PCs over a network.
// Print the output in terms of which all PCs need to be connected, and the length of wire between them.
// Note: Input is given in the form of adjacency list.

// almost dijkstra algorithm

import java.io.*;

import java.util.*;

public class Main {
  static class Edge {
    int src;
    int nbr;
    int wt;

    Edge(int src, int nbr, int wt) {
      this.src = src;
      this.nbr = nbr;
      this.wt = wt;
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int vtces = Integer.parseInt(br.readLine());
    ArrayList< Edge>[] graph = new ArrayList[vtces];
    for (int i = 0; i < vtces; i++) {
      graph[i] = new ArrayList<>();
    }

    int edges = Integer.parseInt(br.readLine());
    for (int i = 0; i < edges; i++) {
      String[] parts = br.readLine().split(" ");
      int v1 = Integer.parseInt(parts[0]);
      int v2 = Integer.parseInt(parts[1]);
      int wt = Integer.parseInt(parts[2]);
      graph[v1].add(new Edge(v1, v2, wt));
      graph[v2].add(new Edge(v2, v1, wt));
    }

    int src = 0;
    PriorityQueue< Pair> queue = new PriorityQueue<>();
    queue.add(new Pair(src, -1, 0));
    Integer[] visited = new Integer[vtces];
    while (queue.size() > 0) {

      // remove
      Pair rem = queue.remove();
      
      // mark*
      if (visited[rem.v] != null) {
        continue;
      }
      visited[rem.v] = rem.p;

      // work
      if (rem.p != -1) {
        System.out.println("[" + rem.v + "-" + rem.p + "@" + rem.wt + "]");
      }

      // add*
      for (Edge e : graph[rem.v]) {
        if (visited[e.nbr] == null) {
          queue.add(new Pair(e.nbr, rem.v, e.wt));
        }
      }
    }
  }

  static class Pair implements Comparable< Pair> {
    Integer v;
    Integer p;
    int wt;

    Pair(Integer v, Integer p, int wt) {
      this.v = v;
      this.p = p;
      this.wt = wt;
    }

    public int compareTo(Pair o) {
      return this.wt - o.wt;
    }
  }
}