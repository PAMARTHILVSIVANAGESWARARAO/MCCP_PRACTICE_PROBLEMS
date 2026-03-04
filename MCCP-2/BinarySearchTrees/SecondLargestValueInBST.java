public class SecondLargestValueInBST {
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
    static int findSecondLargestValue (Node root) {
        if (root == null || (root.left == null && root.right == null)) {
            throw new IllegalArgumentException("Tree is empty or has only one node...");
        }

        Node parent = null;
        Node current = root;
        while (current.right != null) {
            parent = current;
            current = current.right;
        }

        if (current.left != null) {
            Node temp = current.left;
            while (temp.right != null) {
                temp = temp.right;
            }
            return temp.data;
        }

        return parent.data;
    }

    // Using Recursive Approach
    static int findSecondLargestValueRecursive (Node root) {
        if (root == null || (root.left == null && root.right == null)) {
            throw new IllegalArgumentException("Tree is empty or has only one node...");
        }

        if (root.right == null) {
            return findLargestValueRecursive(root.left);
        }

        if (root.right.right == null) {
            return root.data;
        }

        return findSecondLargestValueRecursive(root.right);
    }

    static int findLargestValueRecursive (Node root) {
        if (root == null) {
            throw new IllegalArgumentException("Tree is empty...");
        }

        if (root.right == null) {
            return root.data;
        }

        return findLargestValueRecursive(root.right);
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

        int largestValue = findSecondLargestValue(root);
        System.out.println("\nSecond largest value in the BST (Iterative): " + largestValue);
        int largestValueRecursive = findSecondLargestValueRecursive(root);
        System.out.println("Second largest value in the BST (Recursive): " + largestValueRecursive);
        System.out.println("\n");
    }
}

