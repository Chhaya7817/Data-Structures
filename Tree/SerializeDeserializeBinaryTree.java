import java.util.ArrayList;
public class SerializeDeserializeBinaryTree {
    int k=0;
    Node root;
    void serialize(Node root,ArrayList<Integer> arr)
    {
        if(root==null)
        {
            arr.add(-1);
            return;
        }
        arr.add(root.data);
        serialize(root.left, arr);
        serialize(root.right, arr);
    }
    //To deserialize array into tree
    int index=0;
    Node deserialize(ArrayList<Integer> arr)
    {
        if(index==arr.size())
            return null;
        int val=arr.get(index);
        index++;
        if(val==-1)
            return null;
        Node root=new Node(val);
        root.left=deserialize(arr);
        root.right=deserialize(arr);
        return root;
    }
    //Preorder traversal 
    void Preorder(Node root)
    {
        if(root==null)
            return;
        if(root!=null)
        {
            System.out.print(root.data+" ");
            Preorder(root.left);
            Preorder(root.right);
        }
    }
    public static void main(String[] args) {
        SerializeDeserializeBinaryTree tree=new SerializeDeserializeBinaryTree();
        ArrayList<Integer> arr =new ArrayList<>();
        tree.root=new Node(10);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
        tree.root.left.left=new Node(40);
        tree.root.left.right=new Node(50);
      //  tree.root.left.right.left=new Node(70);
      //  tree.root.left.right.right=new Node(80);
        tree.root.right.right=new Node(60);
        tree.serialize(tree.root, arr);
    //    for(int i=0;i<arr.size();i++)
    //        System.out.print(arr.get(i)+" ");
         tree.deserialize(arr);
        tree.Preorder(tree.root);
    }
}
