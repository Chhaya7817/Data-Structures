import java.util.*;
public class ShortestPath {
    //Sortest path in an unweighted graph.......
    //using BFS
    public static void sortestPath(ArrayList<ArrayList<Integer>> adj,int s,int v)
    {
        Queue<Integer> q=new LinkedList<Integer>();
        boolean visited[]=new boolean[v];
        int dis[]=new int[v];
      //0
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[s]=0;
        q.add(s);
        visited[s]=true;
        while(!q.isEmpty())
        {
            int u=q.poll();
           // System.out.println(u+" ");
            for(int i:adj.get(u))
            {
                if(visited[i]==false)
                {
                    dis[i]=dis[u]+1;
                    visited[i]=true;
                    q.add(i);
                }
            }
        }
        for(int i=0;i<v;i++)
        {
            System.out.println(dis[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Graph gp=new Graph();
        int v=4;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(v);
        //to give the size to adj
        for(int i=0;i<v;i++)
            adj.add(new ArrayList<Integer>());
        gp.addEdge(adj, 0, 1);
        gp.addEdge(adj,0,2);
        gp.addEdge(adj, 1, 2);
        gp.addEdge(adj,1,3);
        gp.addEdge(adj,2,3);
      
        System.out.println("Enter source value");
        int s=sc.nextInt();
        sortestPath(adj, s, v);
    }
    
}
