import java.util.Stack;
//Print the binary teree in spiral(zig-zag) form
public class SpiralTreeTraversal {
    Node root;
    void printSpiral(Node root)
    {
        try{
        Stack<Node> s1=new Stack<Node>();
        Stack<Node> s2=new Stack<Node>();
        if(root==null)
            return;
   
        s1.push(root);
        while(!s1.isEmpty() || !s2.isEmpty())
        {
            while(!s1.isEmpty())
            {
                Node curr=s1.peek();
                s1.pop();
                System.out.print(curr.data +" ");
                if(root.left!=null)
                    s2.push(curr.left);
                if(root.right!=null)
                    s2.push(curr.right);
                
                
            }
            while(!s2.isEmpty())
            {
                Node curr=s2.peek();
                s2.pop();
                System.out.print(curr.data +" ");
                if(root.right!=null)
                    s1.push(curr.right);
                if(root.left!=null)
                    s1.push(curr.left);
                
            }
        }
    }finally{};
    }
    public static void main(String[] args) {
        SpiralTreeTraversal tree=new SpiralTreeTraversal();
        tree.root=new Node(10);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
        tree.root.left.left=new Node(40);
        tree.root.left.right=new Node(50);
        tree.root.left.right.left=new Node(70);
        tree.root.left.right.right=new Node(80);
        tree.root.right.right=new Node(60);
        tree.root.right.left=new Node(90);
        tree.printSpiral(tree.root);
    }
    
}
