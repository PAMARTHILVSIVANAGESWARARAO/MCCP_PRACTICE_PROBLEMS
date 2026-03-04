import java.util.Queue;
import java.util.LinkedList;

public class PrintNonLeafNodesWithOnlyRightSubTree {
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

    static void printNonLeafNodesInorder (Node root) {
        if (root == null) {
            return;
        }

        printNonLeafNodesInorder(root.left);
        if (root.left == null && root.right != null) {
            System.out.print(root.data + " ");
        }
        printNonLeafNodesInorder(root.right);
    }


    static void printNonLeafNodesPreorder (Node root) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right != null) {
            System.out.print(root.data + " ");
        }
        printNonLeafNodesPreorder(root.left);
        printNonLeafNodesPreorder(root.right);
    }

    static void printNonLeafNodesPostorder (Node root) {
        if (root == null) {
            return;
        }

        printNonLeafNodesPostorder(root.left);
        printNonLeafNodesPostorder(root.right);
        if (root.left == null && root.right != null) {
            System.out.print(root.data + " ");
        }
    }

    static void printNonLeafNodesLevelOrder (Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.left == null && current.right != null) {
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

        System.out.println("\n--- Interior/Non-leaf Nodes - Nodes with only right subtree ---");
        System.out.print("\nTraversion of non-leaf nodes (Inorder): ");
        printNonLeafNodesInorder(root);

        System.out.print("\nTraversion of non-leaf nodes (Preorder): ");
        printNonLeafNodesPreorder(root);

        System.out.print("\nTraversion of non-leaf nodes (Postorder): ");
        printNonLeafNodesPostorder(root);

        System.out.print("\nTraversion of non-leaf nodes (LevelOrder): ");
        printNonLeafNodesLevelOrder(root);

        System.out.println("\n");
    }
}

