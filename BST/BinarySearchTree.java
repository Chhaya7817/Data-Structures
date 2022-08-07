///To search , insert, delete in Binary Search Tree
import java.util.Scanner;

class Node{
    int key;
    Node left,right;
    Node(int data){
        key=data;
        left=null;
        right=null;
    }
}
public class BinarySearchTree {
    Node root;
    //Search in BST
    //Recursive search
    boolean recSearch(Node root,int x)
    {
        if(root==null)
            return false;
        else if(root.key==x)
            return true;
        else if(root.key<x)
            return recSearch(root.right,x);
        else
            return recSearch(root.left, x);
    }
    //Iterative Search
    boolean iterateSearch(Node root,int x){
        while(!(root==null))
        {
            if(root.key==x)
                return true;
            if(root.key<x)
                root=root.right;
            else
                root=root.left;
        }
        return false;
    }
    //Insert in BST
    Node insert(Node root,int x)
    {
        if(root==null)
            root=new Node(x);
        if(root.key>x)
            root.left=insert(root.left,x);
        else if(root.key<x)
            root.right=insert(root.right,x);
        return root;
    }

    //Delete
    Node get_succ(Node root)
    {
        Node curr=root.right;
        while(curr!=null && curr.left==null)
            curr=curr.left;
        return curr;
    }
    Node delete(Node root,int x)
    {
        if(root==null)
            return null;
        if(root.key<x)
            root.right=delete(root.right,x);
        else if(root.key>x)
            root.left=delete(root.left, x);
        else
        {
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            else
            {
                Node succ=get_succ(root);
                root.key=succ.key;
                root.right=delete(root.right,x);
            }
        }
        return root;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BinarySearchTree tree=new BinarySearchTree();
        tree.root=new Node(50);
        tree.root.left=new Node(30);
        tree.root.right=new Node(70);
        tree.root.left.left=new Node(20);
        tree.root.left.right=new Node(40);
        tree.root.right.left=new Node(0);
        tree.root.right.right=new Node(80);
        
        while(true)
        {
            System.out.println("Press 1: to search an element");
            System.out.println("Press 2: To insert a node");
            System.out.println("Press 3: To Delete a node");
            System.out.println("Press 4: To quit ");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1 : System.out.println("Enter element:");
                        int x=sc.nextInt();
                        System.out.println(tree.recSearch(tree.root, x));
                        break;
                case 2 : System.out.println("Enter element:");
                         int y=sc.nextInt();
                         System.out.println(tree.insert(tree.root, y));
                         break;
                case 3:  System.out.println("Enter node value:");
                         int z=sc.nextInt();
                         tree.delete(tree.root, z);
                         break;
                case 4: System.exit(0);
                        break;
                default: System.out.println("Wrong Choice!!!!!!!");
            }
        }

    }
    
    
}
