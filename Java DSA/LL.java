public class LL {
    private Node head;
    private Node tail;

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

    }

    public static void main(String[] args) {

        LL list = new LL();

        // 2 9 1 2 9 9 2 8 2

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        // list.addLast(5);
        // list.addLast(6);
        // list.addLast(7);
        // list.addLast(8);
        // list.addLast(9);

        list.display();

        // After Function
        answer(list.head);
        System.out.println();
        list.display();

    }

    public static void answer(Node head) {
        int k = 2;
        int i = 1;
        Node curr = head;
        Node prev = null;

        while (curr != null) {

            if (i == k) {
                prev.next = curr.next;
                curr = curr.next;
                i = 1;
            } else {
                i++;
                prev = curr;
                curr = curr.next;
            }

        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("end of Linked List");

    }

    public void addFirst(int value) {

        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
    }

    public void addLast(int value) {

        if (tail == null) {
            addFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;

    }
}
