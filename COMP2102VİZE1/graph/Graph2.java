package COMP2102VİZE1.graph;
import java.util.Iterator;
import java.util.LinkedList;

public class Graph2 { // Breadth first search
    private int V;
    private LinkedList<Integer>[] adj;

    Graph2(int V){
        this.V= V;
        adj= new LinkedList[V];
        for (int i =0; i< adj.length; i++){
            adj[i]= new LinkedList<>();
        }
    }

    public void addEdge(int v, int w){
        adj[v].add(w);
    }

    public void BFS(int s){
        boolean [] visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[s]= true;
        queue.add(s);

        while(queue.size()!=0){
            s= queue.poll();
            System.out.print(s+" ");
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()){
                int n = i.next();
                if (!visited[n]){
                    visited[n] =true;
                    queue.add(n);
                }
            }
        }
    }
    public static void main(String[] args) {
        Graph2 g = new Graph2(4);

        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g.BFS(2);

        System.out.println("\nFollowing is Breadth First Traversal "+
                "(starting from vertex 1)");
        g.BFS(1);
    }
}
