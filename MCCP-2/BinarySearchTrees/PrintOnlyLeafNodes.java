import java.util.Queue;
import java.util.LinkedList;

public class PrintOnlyLeafNodes {
    static class Node {
        int data;
        Node left, right;
        Node (int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static Node root = null;

    // Static input array
    static int[] inputArray = {50, 30, 70, 20, 40, 60, 80};

    static Node insert (Node root, int x) {
        if (root == null) {
            return new Node(x);
        }

        if (x < root.data) {
            root.left = insert(root.left, x);
        } 
        else if (x > root.data) {
            root.right = insert(root.right, x);
        } 
        else {
            System.out.println("Duplicates are not allowed...");
        }

        return root;
    }

    static void printLeafNodesInorder (Node root) {
        if (root == null) {
            return;
        }

        printLeafNodesInorder(root.left);
        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
        }
        printLeafNodesInorder(root.right);
    }


    static void printLeafNodesPreorder (Node root) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
        }
        printLeafNodesPreorder(root.left);
        printLeafNodesPreorder(root.right);
    }

    static void printLeafNodesPostorder (Node root) {
        if (root == null) {
            return;
        }

        printLeafNodesPostorder(root.left);
        printLeafNodesPostorder(root.right);
        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
        }
    }

    static void printLeafNodesLevelOrder (Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.left == null && current.right == null) {
                System.out.print(current.data + " ");
            }

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    public static void main(String[] args) {
        // Print static input
        System.out.println("Static Input: ");
        System.out.print("Input Array: ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i]);
            if (i < inputArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        
        // Insert elements into BST
        for (int i = 0; i < inputArray.length; i++) {
            root = insert(root, inputArray[i]);
        }

        System.out.print("\nTraversion of leaf nodes (Inorder): ");
        printLeafNodesInorder(root);

        System.out.print("\nTraversion of leaf nodes (Preorder): ");
        printLeafNodesPreorder(root);

        System.out.print("\nTraversion of leaf nodes (Postorder): ");
        printLeafNodesPostorder(root);

        System.out.print("\nTraversion of leaf nodes (LevelOrder): ");
        printLeafNodesLevelOrder(root);

        System.out.println("\n");
    }
}

