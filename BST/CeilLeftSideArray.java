import java.util.Scanner;
public class CeilLeftSideArray {
    Node root;
    Node ceil(Node root,int x)
    {
        if(root==null)
            return null;
        if(root.key==x)
            return root;
        if(root.key>x)
            return ceil(root.left,x);
        else if(root.key<x)
            return ceil(root.right,x);
        return root;
    }
    public static void main(String[] args) {
        CeilLeftSideArray tree=new CeilLeftSideArray();
        Scanner sc=new Scanner(System.in);
        tree.root=new Node(50);
        tree.root.left=new Node(30);
        tree.root.right=new Node(70);
        tree.root.left.left=new Node(20);
        tree.root.left.right=new Node(40);
        tree.root.right.left=new Node(60);
        tree.root.right.right=new Node(80);
        int x=sc.nextInt();
        Node res=tree.ceil(tree.root, x);
        System.out.println("Ceiling of "+ x+" = "+res.key);
    }
    
}
