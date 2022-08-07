import java.util.*;
public class Topological_Sorting {
    static ArrayList<ArrayList<Integer>> adj;
    static int V;
    Topological_Sorting(int v)
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
    //DFS based topological sorting
    public static void DFS(int u,Stack<Integer> stk,boolean visited[])
    {
        Integer i;
        visited[u]=true;
        Iterator<Integer> it=adj.get(u).iterator();
        while(it.hasNext())
        {
            i=it.next();
            if(visited[i]==false)
            {
                DFS(i,stk,visited);
            }
        }
        stk.push(u);
    }
    public static void DFSsort()
    {
        Stack<Integer> stk=new Stack<Integer>();
        boolean visited[]=new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
            {
                DFS(i,stk,visited);
            }
        }
        while(!stk.isEmpty())
        {
            System.out.print(stk.pop()+" ");   
        }
    }
    public static void main(String[] args) {
        Topological_Sorting g=new Topological_Sorting(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        DFSsort();
    }
}
