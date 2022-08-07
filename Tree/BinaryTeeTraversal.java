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
public class BinaryTreeTraversal {
    Node root;
    BinaryTreeTraversal()
    {
        root=null;
    }
    //Inorder traversal
    void Inorder(Node root)
    {
        if(root==null)
            return;
        if(root!=null)
        {
            Inorder(root.left);
            System.out.println(root.data+" ");
            Inorder(root.right);
        }
    }
    //Preorder traversal 
    void Preorder(Node root)
    {
        if(root==null)
            return;
        if(root!=null)
        {
            System.out.print(root.data+" ");
            Inorder(root.left);
            Inorder(root.right);
        }
    }
    //Post order traversal 
    void Postorder(Node root)
    {
        if(root==null)
            return;
        if(root!=null)
        {
            Inorder(root.left);
            Inorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    

    public static void main(String[] args) {
        BinaryTreeTraversal tree=new BinaryTreeTraversal();
        tree.root=new Node(10);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
        tree.root.left.left=new Node(40);
        tree.root.left.right=new Node(50);
        tree.root.left.right.left=new Node(70);
        tree.root.left.right.right=new Node(80);
        tree.root.right.right=new Node(60);
        System.out.println("Inorder traversal of binary tree: " );
        tree.Inorder(tree.root);
        System.out.println("PreOrder traversal of binary tree :");
        tree.Preorder(tree.root);
        System.out.println("PostOrder traversal of binary tree :");
        tree.Postorder(tree.root);

        
    }
}
