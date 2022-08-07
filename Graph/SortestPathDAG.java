//Sortest path in an weighted Directed Acyclic Graph(DAG)
public class SortestPathDAG {
    static ArrayList<ArrayList<Integer>> adj;
    static int V;
    SortestPathDAG(int v)
    {
        V=v;
        adj=new ArrayList<ArrayList<Integer>>(V);
        for(int i=0;i<V;i++)
            adj.add(new ArrayList<Integer>());
    }
    //Directed graph
    void addEdge(int v,int u)
    {
        adj.get(v).add(u);
    }
    

}
