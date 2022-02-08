package COMP2102VİZE1.graph;

import java.util.ArrayList;

public class Graph1 {

    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    // listenin içinde liste tutularak oluşturulduğu için bu şekilde
    public static void printGraph(ArrayList<ArrayList<Integer>> adj){
        for(int i=0; i<adj.size(); i++){
            System.out.println("\nAdjacency list of nodes: "+i);
            System.out.print("head");
            for(int j =0; j<adj.get(i).size(); j++){
                System.out.print("-> "+adj.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(5);
        for (int i =0; i<V; i++){
            adj.add(new ArrayList<Integer>());
        }

        addEdge(adj,0,1);
        addEdge(adj,0,4);
        addEdge(adj,1,2);
        addEdge(adj,1,3);
        addEdge(adj,1,4);
        addEdge(adj,2,3);
        addEdge(adj,3,4);

        printGraph(adj);
    }

}
