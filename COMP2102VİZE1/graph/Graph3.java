package COMP2102VİZE1.graph;
import java.util.Iterator;
import java.util.LinkedList;

public class Graph3 { // Depth first search
   private int V;
   private LinkedList<Integer > [] adj;

   public Graph3(int v){
    this.V= v;
    adj= new LinkedList[v];
    for (int i =0; i< adj.length; i++){
        adj[i]= new LinkedList<>();
    }
}

   public void addEdge(int v,int w){
       adj[v].add(w); // add w to v's list

   }

   public void DFSUtil(int v, boolean[] visited){
       visited[v]= true;
       System.out.print(v+" ");

       Iterator<Integer> i = adj[v].listIterator();
       while(i.hasNext()){
           int n = i.next();

           if (!visited[n]){
               DFSUtil(n, visited);
           }
       }
   }


   public void DFS(int v){
       boolean [] visited= new boolean[V];
       DFSUtil(v,visited);
   }

    public static void main(String[] args) {
       Graph3 g = new Graph3(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println(
                "Following is Depth First Traversal "
                        + "(starting from vertex 2)");

        g.DFS(2);
    }
}
