public class SegmentTree {

    public static void main(String[] args) {
        int[] arr ={3,8,6,7,-2,-8,4,9};
        SegmentTree tree = new SegmentTree(arr);
        tree.display();
    }
    private static class Node
    {
        int data;
        int StartInterval;
        int EndInterval;
        Node Left;
        Node Right;
        public Node(int StartInterval,int EndInterval)
        {
            this.StartInterval = StartInterval;
            this.EndInterval = EndInterval;
        }
    }
    Node root;

    public SegmentTree(int [] arr)
    {
        this.root = constructTree(arr,0,arr.length-1);
    }
    private Node constructTree(int[] arr,int start,int end)
    {
        if(start==end)
        {
            Node leaf = new Node(start,end);
            leaf.data = arr[start];
            return leaf;
        }
        Node node = new Node(start,end);
        int mid = (start+end)/2;
        node.Left = this.constructTree(arr,start,mid);
        node.Right = this.constructTree(arr,mid+1,end);

        node.data= node.Left.data+node.Right.data;
        return node;
    }
    public void display()
    {
        display(root);
    }
    private void display (Node node)
    {
        String str ="";
        if(node.Left!=null)
        {
            str = str +"Interval=["+node.StartInterval+"-"+node.EndInterval+"] and data="+node.Left.data+"=>";
        }
        else
        {
            str = str +"No left Child";
        }
        System.out.println(str);
        str ="";
        if(node.Right!=null)
        {
            str = str +"Interval=["+node.StartInterval+"-"+node.EndInterval+"] and data="+node.Right.data+"=>";
        }
        else
        {
            str = str +"No Right Child";
        }
        System.out.println(str);
    }
}
