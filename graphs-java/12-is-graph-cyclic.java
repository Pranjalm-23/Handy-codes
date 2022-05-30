/* 
Given an undirected graph, check whether the graph is cyclic or not, i.e. find if there exists a cycle in the graph or not.
Print true if there exists a cycle, else false.
Note: Input is given in the form of adjacency list.
Note: Graph may or may not be connected. */

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

    boolean[] visited = new boolean[vtces];
    
    for (int v = 0; v < vtces; v++) {
      if (visited[v] == false) {
        boolean cyclic = IsCyclic(graph, v, visited);
        if (cyclic) {
          System.out.println(true);
          return;
        }
      }
    }

    System.out.println(false);
  }

  public static boolean IsCyclic(ArrayList< Edge>[] graph, int src, boolean[] visited) { 
    ArrayDeque< Integer> queue = new ArrayDeque<>();

    queue.add(src);

    while (queue.size() > 0) {

      // remove
      int rem = queue.removeFirst();

      // mark / revert
      if(visited[rem] == true){
        return true;
      }
      visited[rem] = true;

      // add
      for (Edge e : graph[rem]) {
        if (!visited[e.nbr]) {
          queue.add(e.nbr);
        }
      }
    }

    return false;
  }

}