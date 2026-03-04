public class DeletionInBST {
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
    // Static delete nodes
    static int[] deleteNodes = {20, 50, 80};

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

    static void preorder (Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    static void postorder (Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
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
                successorParent.left = successor.right;
            } 
            else {
                successorParent.right = successor.right;
            }
        }

        System.out.println("Element deleted successfully...");
        return root;
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
        
        // Show traversals after initial insertion
        System.out.println("\n--- Initial BST ---");
        System.out.print("\nInorder Traversal: ");
        inorder(root);
        System.out.print("\nPreorder Traversal: ");
        preorder(root);
        System.out.print("\nPostorder Traversal: ");
        postorder(root);
        
        // Delete nodes statically
        for (int i = 0; i < deleteNodes.length; i++) {
            System.out.println("\n\n--- Deleting node: " + deleteNodes[i] + " ---");
            root = delete(root, deleteNodes[i]);
            System.out.print("Inorder Traversal after deletion: ");
            inorder(root);
            System.out.print("\nPreorder Traversal after deletion: ");
            preorder(root);
            System.out.print("\nPostorder Traversal after deletion: ");
            postorder(root);
        }

        System.out.println("\n");
    }
}

