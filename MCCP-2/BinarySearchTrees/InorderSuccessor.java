public class InorderSuccessor {
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
    // Static target nodes to find inorder successor
    static int[] targetNodes = {40, 50, 70};

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

    static void inorder (Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    
    static Node delete (Node root, int x) {
        Node parent = null, current = root;

        while (current != null && current.data != x) {
            parent = current;
            if (x < current.data) {
                current = current.left;
            } 
            else {
                current = current.right;
            }
        }

        if (current == null) {
            System.out.println("Element not found in the BST...");
            return root;
        }

        // Case 1: Leaf node
        if (current.left == null && current.right == null) {
            if (current != root) {
                if (parent.left == current) {
                    parent.left = null;
                } 
                else {
                    parent.right = null;
                }
            } 
            else {
                root = null;
            }
        }
        
        // Case 2: One child (right child only)
        else if (current.left == null) {
            if (current != root) {
                if (parent.left == current) {
                    parent.left = current.right;
                } 
                else {
                    parent.right = current.right;
                }
            } 
            else {
                root = current.right;
            }
        } 
        
        // Case 3: One child (left child only)
        else if (current.right == null) {
            if (current != root) {
                if (parent.left == current) {
                    parent.left = current.left;
                } 
                else {
                    parent.right = current.left;
                }
            } 
            else {
                root = current.left;
            }
        } 
        
        // Case 4: Two children
        else {
            Node successorParent  = current, successor = current.right;
            while (successor.left != null) {
                successorParent  = successor;
                successor = successor.left;
            }

            current.data = successor.data;

            if (successorParent != current) {
                successorParent .left = successor.right;
            } 
            else {
                successorParent.right = successor.right;
            }
        }

        System.out.println("Element deleted successfully...");
        return root;
    }

    static int inorderSuccessor(Node root, int x) {
        Node successor = null, current = root;

        while (current != null) {
            if (x < current.data) {
                successor = current;
                current = current.left;
            } 
            else {
                current = current.right;
            }
        }

        return (successor != null) ? successor.data : -1; // Return -1 if no successor found
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
        System.out.print("\nInorder Traversal: ");
        inorder(root);
        
        // Find inorder successor for static target nodes
        System.out.println("\n\n--- Inorder Successor Results ---");
        for (int i = 0; i < targetNodes.length; i++) {
            int x = targetNodes[i];
            int successor = inorderSuccessor(root, x);
            if (successor != -1) {
                System.out.println("Inorder Successor of " + x + " is: " + successor);
            } else {
                System.out.println("No inorder successor found for " + x);
            }
        }

        System.out.println("\n");
    }
}

