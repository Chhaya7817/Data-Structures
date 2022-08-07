class MaxInBTree {
    Node root;
    //Print maximum size
    int maxNode(Node root)
    {
   
        if(root==null)
            return Integer.MIN_VALUE;
        return Math.max(root.data,Math.max(maxNode(root.left),maxNode(root.right)));
    }

    public static void main(String[] args) {
        MaxInBTree tree=new MaxInBTree();
        tree.root=new Node(10);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
        tree.root.left.left=new Node(40);
        tree.root.left.right=new Node(50);
        tree.root.left.right.left=new Node(70);
        tree.root.left.right.right=new Node(80);
        tree.root.right.right=new Node(60);
        System.out.println("MAximum node= "+tree.maxNode(tree.root));
    }
    
}
