import java.util.Scanner;

public class BinaryTree {
    public BinaryTree()
    {

    }
    private static class Node
    {
        int value;
        Node Left;
        Node Right;
        public Node(int value)
        {
            this.value = value;
        }
    }
    private Node root;
    public void Populate(Scanner scanner)
    {
        System.out.println("enter the value of root:  ");
        int value = scanner.nextInt();
        root = new Node(value);
        Populate(scanner, root);
    }
    private void Populate(Scanner scanner,Node node)
    {
        System.out.println("do you want to enter value to the left of"+node.value);
        boolean left = scanner.nextBoolean();
        if (left)
        {
            System.out.println("enter the value of left:");
            int value = scanner.nextInt();
            node.Left = new Node(value);
            Populate(scanner,node.Left);
        }
        System.out.println("do you want to enter value to the right of"+node.value);
        boolean right = scanner.nextBoolean();
        if (right)
        {
            System.out.println("enter the value of right:");
            int value = scanner.nextInt();
            node.Right = new Node(value);
            Populate(scanner,node.Right);
        }
    }
    public void Display() {
        Display(root," ");
    }
        private void Display(Node node,String indent)
        {
            if (node == null) {
                return;
            }
            System.out.println(" " + node.value);
            Display(node.Left,indent+"\t");
            Display(node.Right,indent+"\t");
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.Populate(sc);
        tree.Display();
    }
}
