import java.util.Scanner;

class Node1
{
    int key;
    int lcount;
    Node1 left,right;
    Node1(int data)
    {
        key=data;
        lcount=0;
        left=right=null;
    }
}
public class KthSmallestNode {
    Node1 root;
   public static Node1 insert(Node1 root,int x)
    {
        if(root==null)
            return new Node1(x);
        if(root.key<x)
            root.right=insert(root.right,x);
        else if(root.key>x)
        {
            root.left=insert(root.left,x);
            root.lcount++;
        }
        return root;

    }
    public static Node1 KthSmallest(Node1 root,int k)
    {
        if(root==null)
            return null;
        else if(root.lcount==k-1)
            return root;
        else if(root.lcount<k)
            return KthSmallest(root.right, k-root.lcount-1);
        else
            return KthSmallest(root.left, k);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node1 root = null;
        KthSmallestNode tree=new KthSmallestNode();
        int keys[] = { 20, 8, 22, 4, 12, 10, 14 };
     
        for (int x : keys)
            root = insert(root, x);
        System.out.println("Enter value of K:");
        int k=sc.nextInt();
        Node1 res=KthSmallest(tree.root,k);
        System.out.println(res.key);
        
    }
}
