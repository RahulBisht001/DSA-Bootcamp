package SegmentTree;

public class SegmentTree {

    private static class Node {

        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    Node root;

    public SegmentTree(int[] arr) {
        this.root = constructTree(arr, 0, arr.length - 1);
    }

    private Node constructTree(int[] arr, int start, int end) {

        if (start == end) {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        Node curr = new Node(start, end);

        int mid = start + (end - start) / 2;

        curr.left = this.constructTree(arr, start, mid);
        curr.right = this.constructTree(arr, mid + 1, end);

        curr.data = curr.left.data + curr.right.data;

        return curr;
    }

    public void display() {
        display(this.root);
    }

    private void display(Node node) {
        String str = "";

        if (node.left != null) {
            str = str + "Interval = [" + node.left.startInterval + "  " + node.left.endInterval + "] and Data :"
                    + node.left.data + " => ";
        } else
            str = str + " [No Left Child] ";

        // * ______ for current Node _____

        str = str + "Curr Node = [" + node.startInterval + "  " + node.endInterval + "] and Data :"
                + node.data + " <= ";

        if (node.right != null) {
            str = str + "Interval = [" + node.right.startInterval + "  " + node.right.endInterval + "] and Data :"
                    + node.right.data;
        } else
            str = str + " [No Right Child] ";

        System.out.println(str);
        System.out.println();

        if (node.left != null)
            display(node.left);
        if (node.right != null)
            display(node.right);

    }

    // * _________ Query _____

    public int query(int qsIdx, int qeIdx) {
        return this.query(this.root, qsIdx, qeIdx);
    }

    private int query(Node node, int qsi, int qei) {
        if (node.startInterval >= qsi && node.endInterval <= qei)
            return node.data;
        else if (node.startInterval > qei || node.endInterval < qsi)
            return 0;
        else
            return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);

    }

    public void update(int index, int value) {
        this.root.data = this.update(root, index, value);
        System.out.println("Index Updated");
        return;
    }

    private int update(Node node, int index, int value) {

        if (index >= node.startInterval && index <= node.endInterval) {
            if (index == node.startInterval && index == node.endInterval) {
                node.data = value;
                return node.data;
            } else {
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);

                node.data = leftAns + rightAns;
                return node.data;
            }
        }
        return node.data;
    }

    public static void main(String[] args) {
        System.out.println("------------------------");
        System.out.println("Segment Trees");
        System.out.println("------------------------");

        int[] arr = { 3, 8, 6, 7, -2, -8, 4, 9 };
        SegmentTree st = new SegmentTree(arr);
        // st.display();
        System.out.println(st.query(1, 6));
    }
}