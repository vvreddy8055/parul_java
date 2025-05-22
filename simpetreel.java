public class simpetreel{
    public static void main(String[] args) {
        Node root = new Node(12);
        root.left = new Node(11);
        root.right = new Node(12);
        root.left.left = new Node(5);
        root.left.right = new Node(6);

        root.inorder(root);
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
         
    }

    void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
}
