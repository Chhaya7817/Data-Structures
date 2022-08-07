//To print values present at K distance from root of the tree
import java.util.Scanner;
public class KthNode {
    Node root;
    void printKthNode(Node root,int k)
    {
        if(root==null)
            return;
        if(k==0)
            System.out.println(root.data);
        else
        {
            printKthNode(root.left, k-1);
            printKthNode(root.right, k-1);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        KthNode tree=new KthNode();
        tree.root=new Node(10);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
        tree.root.left.left=new Node(40);
        tree.root.left.right=new Node(50);
        tree.root.left.right=new Node(50);
        tree.root.left.right.left=new Node(70);
        tree.root.left.right.right=new Node(80);
        tree.root.right.right=new Node(60);
        System.out.println("Enter valu of K: ");
        int K=sc.nextInt();
        tree.printKthNode(tree.root,K);
    }
    
}
