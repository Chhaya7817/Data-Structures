public class FloorCeilInBST
{
    Node root;
    // to find floor in a binary Searrch Tree
    Node floor(Node root,int x)
    {
        if(root==null)
            return null;
        Node res=null;
        while(root!=null)
        {
            
            if(root.key==x)
                return curr.key;
            else if(root.key<x)
            {
                res=root;
                root=root.right;
            }
            else 
                root=root.left;
        }
        return res;
    }
    // to find ceiling of a number
    Node ceil(Node root,int x)
    {
        if(root==null)
            return null;
        Node res=null;
        while(root!=null)
        {
            
            if(root.key==x)
                return curr.key;
            else if(root.key<x)
            {
                res=root;
                root=root.right;
            }
            else 
                root=root.le;
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}