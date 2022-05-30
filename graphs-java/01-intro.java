
// What is a graph data structure?

// A graph is a set of vertices and edges. See it in the diagram given below:
// So, we can define the graph G = (V,E) where V is the set of vertices and E is the set of edges. As in the above diagram, the circles in which the data is stored are the vertices of the graphs and the lines connecting them together are called edges of the graphs. Now the question arises if a graph is a set of vertices and edges then what can be the minimum number of vertices and edges a graph can have?
// See, a graph is a data structure. This means that it is a way of storing data. Who stores data in a graph? As you saw in the above diagram, a vertex stores the data in the graph. So, presence of at least one vertex is necessary whereas presence of an edge is not. Therefore the smallest graph is a graph with only one vertex and zero edges.
// So, the set V i.e. the set of vertices for a graph G cannot be empty but the set E can be empty.

// graph: arraylist of edges also called adjacency list

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
    int vertices = 7; //0 1 2 3 4 5 6
    ArrayList[] graph = new ArrayList[7];

    //This is as per the diagram (fig-13)

    graph[0].add(new Edge(0, 1, 10));
    graph[0].add(new Edge(0, 2, 20));

    graph[1].add(new Edge(1, 2, 30));
    graph[1].add(new Edge(1, 0, 10));
    graph[1].add(new Edge(1, 3, 50));
    graph[1].add(new Edge(1, 4, 40));

    graph[2].add(new Edge(2, 0, 20));
    graph[2].add(new Edge(2, 1, 30));
    graph[2].add(new Edge(2, 5, 80));

    graph[3].add(new Edge(3, 1, 50));
    graph[3].add(new Edge(3, 5, 70));

    graph[4].add(new Edge(4, 1, 40));
    graph[4].add(new Edge(4, 2, 80));
    graph[4].add(new Edge(4, 5, 60));

    graph[5].add(new Edge(5, 3, 70));
    graph[5].add(new Edge(5, 4, 60));

  }
}