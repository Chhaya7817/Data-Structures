public class CheckBalanceTree {
    Node root;
    //to check Binary Tree id balanced or not if diffrence b/w heights of left subtree and right subtree is <=1 then it is balanced
    //naive approch
    boolean isBalanced(Node root)
    {
        if(root==null) return true;
        int lh=height(root.left);  //left subtree hight
        int rh=height(root.right);//right subtree height
        return (Math.abs(rh-lh)<=1 && isBalanced(root.left) && isBalanced(root.right) );
    }
    //Height of Binary tree
    int height(Node root)
    {
        if(root==null) return 0;
        else
            return Math.max(height(root.left),height(root.right))+1;
    }
    public static void main(String[] args) {
        CheckBalanceTree tree=new CheckBalanceTree();
        tree.root=new Node(10);
        tree.root.left=new Node(20);
        //tree.root.right=new Node(30);
        tree.root.left.left=new Node(40);
        tree.root.left.right=new Node(50);
        tree.root.left.right.left=new Node(70);
        tree.root.left.right.right=new Node(80);
      //   tree.root.right.right=new Node(60);
        boolean res=tree.isBalanced(tree.root);
        System.out.println(res);
    }
}
