public class BTreeViews {
    Node root;
    //left view
    void leftView(Node root)
    {
        if(root==null)
            return;
        System.out.println(root.data);
        leftView(root.left);
    }
    public static void main(String[] args) {
        BTreeViews tree=new BTreeViews();
       /* tree.root=new Node(10);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
        tree.root.left.left=new Node(40);
        tree.root.left.right=new Node(50);
        tree.root.left.right.left=new Node(70);
        tree.root.left.right.right=new Node(80);
        tree.root.right.right=new Node(60);*/
        tree.root=new Node(30);
        tree.root.right=new Node(50);
        tree.root.right.left=new Node(60);
        tree.root.right.left.right=new Node(60);

        tree.leftView(tree.root);
    }
}
