package csd;

import java.util.*;

public class EulerianCycle {

    private int V;
    private LinkedList<Integer>[] adjList;

    EulerianCycle(int v) {
        V = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adjList[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w) {
        adjList[v].add(w);
        adjList[w].add(v);
    }

    boolean hasOddDegree(int v) {
        return adjList[v].size() % 2 != 0;
    }

    boolean hasEulerianCycle() {
        for (int i = 0; i < V; i++) {
            if (hasOddDegree(i)) {
                return false;
            }
        }
        return true;
    }

    boolean hasEulerianPath() {
        int oddDegreeCount = 0;
        for (int i = 0; i < V; i++) {
            if (hasOddDegree(i)) {
                oddDegreeCount++;
            }
        }
        if (oddDegreeCount == 0 || ddDegreeCount == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of vertices of the graph:");
        int V = sc.nextInt();

        EulerianCycle graph = new EulerianCycle(V);

        System.out.println("Enter the edge of the graph (in u,v format)");
        System.out.println("(Enter -1 to end edge import)");

        while (true) {
            int u = sc.nextInt();
            if (u == -1) {
                break;
            }
            int v = sc.nextInt();
            graph.addEdge(u, v);
        }

        if (graph.hasEulerianPath()) {
            System.out.println("The graph has an Euler path.");
        } else {
            System.out.println("The graph has no Euler path.");
            return;
        }

        if (graph.hasEulerianCycle()) {
            System.out.println("The graph has an Euler cycle.");
        } else {
            System.out.println("The graph does not have an Euler cycle.");
        }

    }
}
