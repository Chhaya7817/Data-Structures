import java.util.*;
public class Total_Islands {
    public static void BFS1(ArrayList<ArrayList<Integer>> adj,int s,boolean visited[])
    {
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
    public static int countIslands(ArrayList<ArrayList<Integer>> adj,int v)
    {
        boolean visited[]=new boolean[v+1];
        int count=0;
        for(int i=0;i<v;i++)
        {
            if(visited[i]==false)
            {
                BFS1(adj, i, visited);
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Graph gp=new Graph();
        int v=8;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(v);
        //to give the size to adj
        for(int i=0;i<v;i++)
            adj.add(new ArrayList<Integer>());
        gp.addEdge(adj, 0, 1);
        gp.addEdge(adj,0,2);
        gp.addEdge(adj, 1, 2);
        gp.addEdge(adj,3,6);
        gp.addEdge(adj, 5, 7);
        int count=countIslands(adj, v);
        System.out.println(count);
    }
    
}
