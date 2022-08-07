//Traversing tree using level order traversal 
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTreeTraversal {
    Node root;
    LevelOrderTreeTraversal()
    {
        root=null;
    }
    //print nodes one by one
    public void printTree(Node root)
    {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node current=q.poll();
            System.out.print(current.data+" ");
            if(current.left!=null)
                q.add(current.left);
            if(current.right!=null)
                q.add(current.right);
        }
    }
    // print nodes line by line
    //Method 1
    void printTreeLineByLine(Node root)
    {
        //inserting null in the queue after each level
        //when u traverse last node of a leveel the queue contains all the nodes of next level
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        q.add(null);
        System.out.println("Printing tree line by line:");
        while(q.size()>1)
        {
            Node current=q.poll();
            if(current==null)
            {
                System.out.println();
                q.add(null);
                continue;
            }
            else
            {
                System.out.print(current.data+" ");
                if(current.left!=null)
                    q.add(current.left);
                if(current.right!=null)
                    q.add(current.right);

            }
        }
    }
    //Method 2
    void printLineWise(Node root)
    {
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty())
        {
             int count=q.size();
             for(int i=0;i<count;i++)
             {
                 Node current=q.poll();
                 System.out.print(current.data+" ");
                if(current.left!=null)
                    q.add(current.left);
                if(current.right!=null)
                    q.add(current.right);                 
             }
             System.out.println();
        }
    }
    public static void main(String[] args) {
        LevelOrderTreeTraversal tree=new LevelOrderTreeTraversal();
        tree.root=new Node(10);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
        tree.root.left.left=new Node(40);
        tree.root.left.right=new Node(50);
        tree.root.left.right=new Node(50);
        tree.root.left.right.left=new Node(70);
        tree.root.left.right.right=new Node(80);
        tree.root.right.right=new Node(60);
     //   tree.printTree(tree.root);
     //   tree.printTreeLineByLine(tree.root);
        tree.printLineWise(tree.root);
        
    }
}
