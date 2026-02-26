import java.util.Scanner;

public class BinarySearchTreeWithArrayInout {
    Node root = null;

    Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTreeWithArrayInout bst = new BinarySearchTreeWithArrayInout();

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            bst.root = bst.insert(bst.root, arr[i]);
        }
        System.out.println("Inorder Traversal or Tree Sort:");
        bst.inorder(bst.root);
        

        sc.close();
    }
}
