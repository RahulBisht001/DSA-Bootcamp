import java.util.ArrayList;

public class BinarySearchTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    /*
     * Insertion in a BST Concept
     */
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // left SubTree
            root.left = insert(root.left, val);
        } else {
            // right SubTree
            root.right = insert(root.right, val);
        }
        return root;
    }
    // Inorder Traversal

    public static void inorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data + "  ");
        inorderTraversal(root.right);
    }

    /*
     * Search an element in BST Using its Property
     */
    public static boolean searchKey(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return searchKey(root.left, key);
        } else {
            return searchKey(root.right, key);
        }
    }

    /*
     * Most Imp Concept: Deletion of a Node
     */
    public static Node delete(Node root, int val) {
        // Search
        if (root == null) {
            return null;
        }
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else {
            // Here Root.data = val

            // Case 1 : when Node is leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case 2 : Only One Child;
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 3 : 2 Child
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;

    }

    public static Node inorderSuccessor(Node root) {

        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    /*
     * Print element in a given range using bst property Concept
     */
    public static void printInRange(Node root, int L, int R) {

        if (root == null) {
            return;
        }

        if (root.data >= L && root.data <= R) {
            printInRange(root.left, L, R);
            System.out.print(root.data + "  ");
            printInRange(root.right, L, R);

        } else if (R < root.data) {
            printInRange(root.left, L, R);

        } else {
            printInRange(root.right, L, R);
        }
    }

    /*
     * Root to leaf path concept
     */

    public static void rootToLeaf(Node root, ArrayList<Integer> path) {

        if (root == null) {
            return;
        }

        path.add(root.data);
        if (root.left == null && root.right == null) {
            // Leaf Condition
            System.out.println(path.toString());
            System.out.println();
        } else {
            // Non Leaf Condition
            rootToLeaf(root.left, path);
            rootToLeaf(root.right, path);
        }

        path.remove(path.size() - 1);

    }

    public static void main(String[] args) {
        int value[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }

        inorderTraversal(root);
        // System.out.println();
        // // System.out.println(searchKey(root, 100));
        // // delete(root, 3);
        // // inorderTraversal(root);
        // // printInRange(root, 12, 17);
        // rootToLeaf(root, new ArrayList<Integer>());
        // System.out.println();
        insert(root, -1);
        System.out.println();
        inorderTraversal(root);
    }

}
