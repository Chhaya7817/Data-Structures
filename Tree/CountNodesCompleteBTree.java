//Count total number of nodes in complete binary tree
//O(h)
public class CountNodesCompleteBTree {//Timme complexity O(height)
    Node root;
    int countNodes(Node root)
    {
        if(root==null)
            return 0;
        return 1+countNodes(root.left)+countNodes(root.right);

    }
    //Efficient solution using concept of pefect Binary tree 
    //Total nodes in perfect binarybtree (2^height)-1
    //Time complexity O(logn * log n)
    int count(Node root)
    {
        if(root==null)
            return 0;
        int lh=0,rh=0;
        Node curr=root;
        while(!(curr==null))
        {
            lh++;
            curr=curr.left;
        }
        curr=root;
        while(!(curr==null))
        {
            rh++;
            curr=curr.right;
        }
        if(lh==rh)
            return 1<<lh;
        return 1+count(root.left)+count(root.right);
    }
    public static void main(String[] args) {
        CountNodesCompleteBTree tree=new CountNodesCompleteBTree();
        tree.root=new Node(10);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
        tree.root.left.left=new Node(40);
        tree.root.left.right=new Node(50);
        tree.root.left.right.left=new Node(70);
        tree.root.left.right.right=new Node(80);
        tree.root.right.right=new Node(60);
        System.out.println(tree.countNodes(tree.root));//Naive solution
        System.out.println(tree.count(tree.root));//Efficient solution O(log n * log n)

    }
}
