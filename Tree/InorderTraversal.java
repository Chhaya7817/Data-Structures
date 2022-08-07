class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }
}
public class InorderTraversal {
    Node root;
    InorderTraversal()
    {
        root=null;
    }
    void Inorder(Node root)
    {
        if(root==null)
            return;
        if(root!=null)
        {
            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);
        }
    }

    public static void main(String[] args) {
        InorderTraversal tree=new InorderTraversal();
        tree.root=new Node(10);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
        tree.root.left.left=new Node(40);
        tree.root.left.right=new Node(50);
        tree.root.left.right=new Node(50);
        tree.root.left.right.left=new Node(70);
        tree.root.left.right.right=new Node(80);
        tree.root.right.right=new Node(60);
        tree.Inorder(tree.root);


        
    }
}
