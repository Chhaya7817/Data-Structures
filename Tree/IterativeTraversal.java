import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class IterativeTraversal {
    Node root;
    //Iterative traversal using inorder
    void iterativeInorder(Node root)
    {
        Stack<Node> s=new Stack<Node>();
        if(root==null)
        return;
        Node curr=root;
        while(curr!=null|| !(s.isEmpty()))
        {
            while(curr!=null)
            {
                s.push(curr);
                curr=curr.left;
            }
            curr=s.pop();
            System.out.print(curr.data+" ");
            curr=curr.right;
        }
    }
    //Itertive traersal using preorder 
    void preorder(Node root)
    {
        Stack<Node> s=new Stack<Node>();
        if(root==null)
            return;
        s.push(root);
        while(!s.isEmpty())
        {
            Node curr=s.pop();
            System.out.print(curr.data+" ");
            if(curr.right!=null)
                s.push(curr.right);
            if(curr.left!=null)
                s.push(curr.left);
        }
        
    }
    public static void main(String[] args) {
        IterativeTraversal tree=new IterativeTraversal();
        tree.root=new Node(10);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
        tree.root.left.left=new Node(40);
        tree.root.left.right=new Node(50);
        tree.root.left.right=new Node(50);
        tree.root.left.right.left=new Node(70);
        tree.root.left.right.right=new Node(80);
        tree.root.right.right=new Node(60);
    //    tree.iterativeInorder(tree.root);
        tree.preorder(tree.root);
        
    }
}
