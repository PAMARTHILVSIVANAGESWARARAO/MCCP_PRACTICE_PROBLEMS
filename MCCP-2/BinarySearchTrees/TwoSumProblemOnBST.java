import java.util.ArrayList;

public class TwoSumProblemOnBST {
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
    // Static target sums to find
    static int[] targetSums = {100, 90, 150};

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

    static void inorderToList(Node root, ArrayList<Integer> sortedList) {
        if (root != null) {
            inorderToList(root.left, sortedList);
            sortedList.add(root.data);
            inorderToList(root.right, sortedList);
        }
    }

    static boolean findTwoSum (Node root, int targetSum) {
        if (root == null) {
            return false;
        }

        ArrayList<Integer> sortedList = new ArrayList<>();
        inorderToList(root, sortedList);

        int left = 0, right = sortedList.size() - 1;
        while (left < right) {
            int currentSum = sortedList.get(left) + sortedList.get(right);
            if (currentSum == targetSum) {
                return true;
            } else if (currentSum < targetSum) {
                left++;
            } else {
                right--;
            }
        }

        return false;
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

        // Show inorder traversal
        System.out.println("\n--- Two Sum Problem on BST ---");
        
        // Check for static target sums
        for (int i = 0; i < targetSums.length; i++) {
            int targetSum = targetSums[i];
            boolean found = findTwoSum(root, targetSum);
            System.out.println("\nTarget Sum: " + targetSum);
            if (found) {
                System.out.println("Pair with the given sum exists in the BST.");
            } else {
                System.out.println("Pair with the given sum does not exist in the BST.");
            }
        }

        System.out.println("\n");
    }
}

