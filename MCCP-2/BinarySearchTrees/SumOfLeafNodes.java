import java.util.LinkedList;
import java.util.Queue;

public class SumOfLeafNodes {
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

    static int sumOfLeafNodesInorder (Node root) {
        if (root == null) {
            return 0;
        }

        int left = sumOfLeafNodesInorder(root.left);
        
        if (root.left == null && root.right == null) {
            return root.data;
        }
        
        int right = sumOfLeafNodesInorder(root.right);

        return left + right;
    }

    static int sumOfLeafNodesPreorder (Node root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return root.data;
        }

        int left = sumOfLeafNodesPreorder(root.left);
        int right = sumOfLeafNodesPreorder(root.right);

        return left + right;
    }

    static int sumOfLeafNodesPostorder (Node root) {
        if (root == null) {
            return 0;
        }

        int left = sumOfLeafNodesPostorder(root.left);
        int right = sumOfLeafNodesPostorder(root.right);
        
        if (root.left == null && root.right == null) {
            return root.data;
        }

        return left + right;
    }

    static int sumOfLeafNodesLevelOrder (Node root) {
        if (root == null) {
            return 0;
        }

        int sum = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.left == null && current.right == null) {
                sum += current.data;
            }

            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
        }

        return sum;
    }

    static int sumOfLeafNodes (Node root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return root.data;
        }

        return sumOfLeafNodes(root.left) + sumOfLeafNodes(root.right);
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

        System.out.println("\nSum of leaf nodes (Inorder): " + sumOfLeafNodesInorder(root));
        System.out.println("Sum of leaf nodes (Preorder): " + sumOfLeafNodesPreorder(root));
        System.out.println("Sum of leaf nodes (Postorder): " + sumOfLeafNodesPostorder(root));
        System.out.println("Sum of leaf nodes (LevelOrder): " + sumOfLeafNodesLevelOrder(root));
        System.out.println("Sum of leaf nodes (Binary Recursion): " + sumOfLeafNodes(root));
        System.out.println("\n");
    }
}

