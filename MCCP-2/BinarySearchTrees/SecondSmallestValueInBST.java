public class SecondSmallestValueInBST {
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
    static int findSecondSmallestValue (Node root) {
        if (root == null || (root.left == null && root.right == null)) {
            throw new IllegalArgumentException("Tree is empty or has only one node...");
        }

        Node parent = null;
        Node current = root;
        while (current.left != null) {
            parent = current;
            current = current.left;
        }

        if (current.right != null) {
            Node temp = current.right;
            while (temp.left != null) {
                temp = temp.left;
            }
            return temp.data;
        }

        return parent.data;
    }

    // Using Recursive Approach
    static int findSecondSmallestValueRecursive (Node root) {
        if (root == null || (root.left == null && root.right == null)) {
            throw new IllegalArgumentException("Tree is empty or has only one node...");
        }

        return findSecondSmallestValueRecursiveHelper(root, null);
    }

    static int findSecondSmallestValueRecursiveHelper (Node root, Node parent) {
        if (root.left == null) {
            if (root.right != null) {
                Node temp = root.right;
                while (temp.left != null) {
                    temp = temp.left;
                }
                return temp.data;
            }
            return parent.data;
        }

        return findSecondSmallestValueRecursiveHelper(root.left, root);
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

        int smallestValue = findSecondSmallestValue(root);
        System.out.println("\nSecond smallest value in the BST (Iterative): " + smallestValue);
        int smallestValueRecursive = findSecondSmallestValueRecursive(root);
        System.out.println("Second smallest value in the BST (Recursive): " + smallestValueRecursive);
        System.out.println("\n");
    }
}

