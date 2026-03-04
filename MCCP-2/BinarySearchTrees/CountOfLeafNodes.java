import java.util.Queue;
import java.util.LinkedList;

public class CountOfLeafNodes {
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

    static int countLeafNodesInorder (Node root) {
        if (root == null) {
            return 0;
        }

        int left = countLeafNodesInorder(root.left);
        
        if (root.left == null && root.right == null) {
            return 1;
        }
        
        int right = countLeafNodesInorder(root.right);

        return left + right;
    }

    static int countLeafNodesPreorder (Node root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        int left = countLeafNodesPreorder(root.left);
        int right = countLeafNodesPreorder(root.right);
        
        return left + right;
    }

    static int countLeafNodesPostorder (Node root) {
        if (root == null) {
            return 0;
        }

        int left = countLeafNodesPostorder(root.left);
        int right = countLeafNodesPostorder(root.right);

        if (root.left == null && root.right == null) {
            return 1;
        }

        return left + right;
    }

    static int countLeafNodesLevelOrder (Node root) {
        int count = 0;
        if (root == null) {
            return count;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.left == null && current.right == null) {
                count++;
            }

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }

        return count;
    }

    static int countLeafNodesBinaryRecursion (Node root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        return countLeafNodesBinaryRecursion(root.left) + countLeafNodesBinaryRecursion(root.right);
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

        System.out.println("\nCount of leaf nodes (Inorder): " + countLeafNodesInorder(root));
        System.out.println("Count of leaf nodes (Preorder): " + countLeafNodesPreorder(root));
        System.out.println("Count of leaf nodes (Postorder): " + countLeafNodesPostorder(root));
        System.out.println("Count of leaf nodes (LevelOrder): " + countLeafNodesLevelOrder(root));
        System.out.println("Count of leaf nodes (Binary Recursion): " + countLeafNodesBinaryRecursion(root));

        System.out.println("\n");
    }
}

