//Find the maximum width of binary tree
import java.util.LinkedList;
import java.util.Queue;
public class MaxWidthOfTree {
    Node root;
    int maxWidth(Node root)
    {
        Queue<Node> q=new LinkedList<Node>();
        if(root==null)
            return 0;
        q.add(root);
        int width=Integer.MIN_VALUE;
        while(!q.isEmpty())
        {
             int count=q.size();
             width=Math.max(width,count);
             for(int i=0;i<count;i++)
             {
                 Node current=q.poll();
                if(current.left!=null)
                    q.add(current.left);
                if(current.right!=null)
                    q.add(current.right);                 
             }
        }
        return width;

    }
    public static void main(String[] args) {
        MaxWidthOfTree tree=new MaxWidthOfTree();
        tree.root=new Node(10);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
        tree.root.left.left=new Node(40);
        tree.root.left.right=new Node(50);
        tree.root.left.right.left=new Node(70);
        tree.root.left.right.right=new Node(80);
        tree.root.right.right=new Node(60);
        tree.root.right.left=new Node(90);
        int width=tree.maxWidth(tree.root);
        /*
        tree.root=new Node(8);
        tree.root.left=new Node(30);
        tree.root.right=new Node(20);
        tree.root.right.right=new Node(70);
        tree.root.right.left=new Node(300);
        tree.root.left.left=new Node(90);
        tree.root.left.right=new Node(100);
*/
        System.out.println("Maximum width of given tree= "+width);
    }

}
