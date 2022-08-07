import java.util.*;
//To traverseb the graph as breadth first search
public class BFS {
    public static void BFS1(ArrayList<ArrayList<Integer>> adj,int v,int s)
    {
        boolean visited[]=new boolean[v+1];
        Queue<Integer> q=new LinkedList<Integer>();
        visited[s]=true;
        q.add(s);
        while(!q.isEmpty())
        {
            int u=q.poll();
            System.out.println(u+" ");
            for(int i:adj.get(u))
            {
                if(visited[i]==false)
                {
                    visited[i]=true;
                    q.add(i);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Graph gp=new Graph();
        int v=5;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(v);
        //to give the size to adj
        for(int i=0;i<v;i++)
            adj.add(new ArrayList<Integer>());
        gp.addEdge(adj, 0, 1);
        gp.addEdge(adj,0,2);
        gp.addEdge(adj, 1, 2);
        gp.addEdge(adj,1,3);
        gp.addEdge(adj,2,3);
        gp.addEdge(adj,2,4);
        gp.addEdge(adj,3,4);
        int s=sc.nextInt();
        BFS1(adj, v, s);

    }
    
}
