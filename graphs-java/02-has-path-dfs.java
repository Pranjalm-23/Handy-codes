/* 
we need to check whether there is a path between 2 given vertices of the graph. Prerequisite for this problem is the Flood Fill problem which we did in Recursion. If you have already gone through that problem then this problem will be very easy for you to understand.

Recursion.
 */

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

    int src = Integer.parseInt(br.readLine()); //source vertex
    int dest = Integer.parseInt(br.readLine()); // destination

    boolean[] visited = new boolean[vtces];
    boolean flag = hasPath(graph, src, dest, visited);
    System.out.println(flag);
  }

  public static boolean hasPath(ArrayList< Edge>[] graph, int src, int dest, boolean[] visited) {
    if (src == dest)
      return true;

    visited[src] = true;
    for (Edge e : graph[src]) {
      if (!visited[e.nbr]) {
        boolean nbrHasPath = hasPath(graph, e.nbr, dest, visited);
        if (nbrHasPath)
          return true;
      }
    }
    return false;
  }

}