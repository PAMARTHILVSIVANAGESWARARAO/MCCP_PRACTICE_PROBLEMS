public class SmallestValueInBST {
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

    // Using Iterative Approach
    static int findSmallestValue (Node root) {
        if (root == null) {
            throw new IllegalArgumentException("Tree is empty...");
        }

        Node current = root;
        while (current.left != null) {
            current = current.left;
        }

        return current.data;
    }

    // Using Recursive Approach
    static int findSmallestValueRecursive (Node root) {
        if (root == null) {
            throw new IllegalArgumentException("Tree is empty...");
        }

        if (root.left == null) {
            return root.data;
        }

        return findSmallestValueRecursive(root.left);
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

        int smallestValue = findSmallestValue(root);
        System.out.println("\nSmallest value in the BST (Iterative): " + smallestValue);
        int smallestValueRecursive = findSmallestValueRecursive(root);
        System.out.println("Smallest value in the BST (Recursive): " + smallestValueRecursive);
        System.out.println("\n");
    }
}

