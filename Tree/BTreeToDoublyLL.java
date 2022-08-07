//Convert a binary tree into doubly linked list 
//Inorder traversal
import java.util.*;
public class BTreeToDoublyLL {
    Node previous=null;
    Node root;
    Node BTToDoublyLList(Node root)
    {
        if(root==null)
            return root;
        Node head=BTToDoublyLList(root.left);
        if(previous==null)
        {
            head=root;
        }
        else
        {
            root.left=previous;
            previous.right=root;
        }
        previous=root;
        BTToDoublyLList(root.right);
        return head;
    }
    public static void main(String[] args) {
        BTreeToDoublyLL tree=new BTreeToDoublyLL();
        tree.root=new Node(10);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
        tree.root.left.left=new Node(40);
        tree.root.left.right=new Node(50);
        tree.root.left.right.left=new Node(70);
        tree.root.left.right.right=new Node(80);
        tree.root.right.right=new Node(60);
        System.out.println(tree.BTToDoublyLList(tree.root).data);
    }
}
