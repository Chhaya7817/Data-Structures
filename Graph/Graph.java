import java.util.ArrayList;

import java.util.ArrayList;
public class Graph {
    // to insert a vertex(Edge)
    public static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    //To print the graph
    public static void printGraph(ArrayList<ArrayList<Integer>> adj)
    {
        for(int i=0;i<adj.size();i++)
        {
            for(int j=0;j<adj.get(i).size();j++)
                System.out.print(adj.get(i).get(j)+" ");
            System.out.println(); 
        }
    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(v);
        //to give the size to adj
        for(int i=0;i<v;i++)
            adj.add(new ArrayList<Integer>());
        addEdge(adj, 0, 1);
        addEdge(adj,0,2);
        addEdge(adj, 1, 2);
        addEdge(adj,1,3);
        printGraph(adj);
        
    }
}
