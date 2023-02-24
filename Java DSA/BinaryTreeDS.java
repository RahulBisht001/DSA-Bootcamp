import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeDS {

    // Node class
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {

        static int index = -1;

        // Building a tree
        public Node buildTree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        // PreOrder traversal
        public void preOrder(Node root) {

            if (root == null) {
                System.out.print(-1 + "  ");
                return;
            }
            System.out.print(root.data + "  ");
            preOrder(root.left);
            preOrder(root.right);
        }

        // Inorder traversal
        public void inOrder(Node root) {
            if (root == null) {
                System.out.print(-1 + "  ");
                return;
            }

            inOrder(root.left);
            System.out.print(root.data + "  ");
            inOrder(root.right);
        }

        // PostOrder Traversal
        public void postOrder(Node root) {

            if (root == null) {
                System.out.print(-1 + "  ");
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + "  ");
        }

        // level order traversal
        /*
         * we cannot do it directly we need to use Queue data Structure
         * F.I.F.O property
         * used
         */
        public void levelOrder(Node root) {
            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {

                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }

                } else {
                    System.out.print(currNode.data + "  ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        public int heightOfTree(Node root) {
            if (root == null) {
                return 0;
            }
            int height = 1;
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {

                Node currNode = q.remove();
                if (currNode == null) {
                    if (q.isEmpty()) {
                        break;
                    } else {
                        height++;
                        q.add(null);
                    }
                } else {

                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
            return height;
        }

        public int diameter(Node root) {

            if (root == null) {
                return 0;
            }

            int dia1 = diameter(root.left);
            int dia2 = diameter(root.right);
            int dia3 = heightOfTree(root.left) + heightOfTree(root.right) + 1;

            int dia = Math.max(dia1, Math.max(dia2, dia3));
            return dia;
        }

        public int[] diameter2(Node root, int[] arr) {

            if (root == null) {
                arr[0] = 0;
                arr[1] = 0;
                return arr;
            }

            int[] left = diameter2(root.left, arr);
            int[] right = diameter2(root.right, arr);

            int height = Math.max(left[0], right[0]) + 1;

            int dia1 = left[1];
            int dia2 = right[1];
            int dia3 = left[0] + right[0] + 1;
            int dia = Math.max(dia1, Math.max(dia2, dia3));

            arr[0] = height;
            arr[1] = dia;
            return arr;
        }

    }

    public static void main(String[] args) {

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        // System.out.println(tree.heightOfTree(root));

        int arr[] = { 0, 0 };
        tree.diameter2(root, arr);
        System.out.println(Arrays.toString(arr));
    }

}
