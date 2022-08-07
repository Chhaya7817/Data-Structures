import java.util.ArrayList;

public class DetectCycle {
    //Detect there is cycle or not in an undirected graph
    //using DFS
    public static boolean DFSRec(ArrayList<ArrayList<Integer>> adj,int s,boolean visited[],int parent)
    {
        visited[s]=true;
        for(int u:adj.get(s))
        {
            if(visited[u]==false)
            {
                if(DFSRec(adj, u, visited, s)==true)
                    return true;
            }
            else if(u!=parent)
                return true;
        }
        return false;
    }
    public static boolean DFS(ArrayList<ArrayList<Integer>> adj,int v)
    {
        boolean visited[]=new boolean[v];
        for(int i=0;i<v;i++)
        {
            if(visited[i]==false)
                if(DFSRec(adj, i, visited, -1)==true)
                    return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Graph gp=new Graph();
     /*   int v=4;
       ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(v);
        //to give the size to adj
        for(int i=0;i<v;i++)
            adj.add(new ArrayList<Integer>());
        gp.addEdge(adj, 0, 1);
        gp.addEdge(adj,0,2);
        gp.addEdge(adj, 1, 2);
        gp.addEdge(adj,2,3);
        gp.addEdge(adj,3,3);
        System.out.println(DFS(adj, v));*/
        Graph g2=new Graph();
        int v2=3;
        ArrayList<ArrayList<Integer>> adj2=new ArrayList<ArrayList<Integer>>(v2);
        for(int i=0;i<v2;i++)
            adj2.add(new ArrayList<Integer>());
        g2.addEdge(adj2,0,1);
        g2.addEdge(adj2,1,2);
        System.out.println(DFS(adj2, v2));
    }
        
    
    
}
