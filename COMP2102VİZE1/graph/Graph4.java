package COMP2102VİZE1.graph;


import java.util.Iterator;
import java.util.LinkedList;

public class Graph4 { // hashpath yani nodeların arasında yol olup olmadığnı bulmak
    private int V;
    private LinkedList<Integer>[] adj;

    Graph4(int v){
        this.V=v;
        adj = new LinkedList[v];
        for (int i =0; i<v; i++){
            adj[i]= new LinkedList<>();
        }
    }

    public void addEdge(int v, int w){
        adj[v].add(w);
    }

   public Boolean isReachable(int s,int d){
        boolean [] visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[s]= true;
        queue.add(s);
       Iterator<Integer> i;
       while(queue.size()!=0){
           s=queue.poll();
           int n;
           i = adj[s].listIterator();
           while(i.hasNext()){
               n= i.next();
               if(n==d){
                   return true;
               }
               if(!visited[n]){
                   visited[n]=true;
                   queue.add(n);
               }
           }
       }
        return false;
    }

    public static void main(String[] args) {
        Graph4 g = new Graph4(4);
        g.addEdge(0,1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        int u =1;
        int v =3;
        if(g.isReachable(u,v))
        System.out.println("There is a path from " + u +" to " + v);
        else
        System.out.println("There is no path from " + u +" to " + v);

        u =3;
        v =1;
        if (g.isReachable(u, v))
            System.out.println("There is a path from " + u +" to " + v);
        else
            System.out.println("There is no path from " + u +" to " + v);

    }



}
