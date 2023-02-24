// Kunal Kushwaha
public class LL_imp {

    private Node head;
    private Node tail;
    private int size;

    public LL_imp() {
        this.size = 0;
    }

    public void insertFirst(int value) {

        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int value) {

        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;

        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("END of Linked List");
    }

    public int size() {
        return size;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        // public Node(int value, Node next) {

        // this.value = value;
        // this.next = next;
        // }
    }
}
