package com.graph;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author prem chand shah on 24-09-2018
 * @project myJava
 */

public class BreadthFirstSearch {
    private int V;
    private LinkedList[] adjList;

    public BreadthFirstSearch(int v) {
        V = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<Integer>();
        }
    }

    private void addEdge(int v, int w) {
        if (v >= V) {
            throw new IllegalArgumentException("trying to add to edge to non-existing vertex");
        } else
            adjList[v].add(w);
    }

    /**
     * get bfs from source s
     */
    public void bfs(int s) {
        // boolean array of vertex size by default all the value will be false
        boolean[] isVisited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();
        isVisited[s] = true;

        queue.add(s);

        while (queue.size() != 0) {
            int head = queue.poll();
            System.out.print(head + " ");

            Iterator<Integer> list = adjList[head].listIterator();
            while (list.hasNext()) {
                int n = list.next();
                if (!isVisited[n]) {
                    isVisited[n] = true;
                    queue.add(n);
                }
            }
        }

    }

    public void dfsUtils(int s, boolean[] isVisited) {
        isVisited[s] = true;
        System.out.print(s + " ");

        Iterator<Integer> list = adjList[s].listIterator();
        while (list.hasNext()) {
            int n = list.next();
            if (!isVisited[n]) {
                dfsUtils(n, isVisited);
            }
        }
    }

    void dfs(int v) {
        // Mark all the vertices as not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[V];

        // Call the recursive helper function to print DFS traversal
        dfsUtils(v, visited);
    }

    public static void main(String[] args) {
        BreadthFirstSearch g = new BreadthFirstSearch(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal " +
                "(starting from vertex 2)");
        g.bfs(2);
        System.out.println();
        g.dfs(2);
    }
}
