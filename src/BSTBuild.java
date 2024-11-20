class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode( int data){
        this.data=data;
    }
    public String toString()
    {
        return "Value="+data;
    }
}
public class BSTBuild
{
    public static void main(String[] args) {
        var root= new TreeNode(7);
        root.left=new TreeNode(1);
        root.right=new TreeNode(8);

    }
}
