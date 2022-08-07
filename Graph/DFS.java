import java.util.ArrayList;

//Depth First search 
public class DFS {
    public static void DFSRec(ArrayList<ArrayList<Integer>> adj,int s,boolean visited[])
    {
        visited[s]=true;
        System.out.println(s+" ");
        for(int u:adj.get(s))
        {
            if(visited[u]==false)
                DFSRec(adj,u,visited);
        }
    }
    public static void DFS(ArrayList<ArrayList<Integer>> adj,int v)
    {
        boolean visited[]=new boolean[v];
        for(int i=2;i<v;i++)
        {
            if(visited[i]==false)
                DFSRec(adj,i,visited);
        }
    }
    public static void main(String[] args) {
        Graph gp=new Graph();
        int v=4;
       ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(v);
        //to give the size to adj
        for(int i=0;i<v;i++)
            adj.add(new ArrayList<Integer>());
        gp.addEdge(adj, 0, 1);
        gp.addEdge(adj,0,2);
        gp.addEdge(adj, 1, 2);
        gp.addEdge(adj,2,0);
        gp.addEdge(adj,2,3);
        gp.addEdge(adj,3,3);
        DFS(adj, v);
    } 
}
