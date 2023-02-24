public class DLL {
    private Node head;
    private Node tail;
    private int size;

    class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {

            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public int getSize() {
        return size;
    }

    public void display() {
        Node temp = head;
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("end of Linked List");

    }

    public void displayReverse() {
        Node temp = head;
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.prev;
        }
        System.out.println("Begining  of Linked List");

    }

    public void addFirst(int value) {

        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;

    }

    public void addLast(int value) {
        if (tail == null) {
            addFirst(value);
            return;
        }
        Node node = new Node(value);
        node.prev = tail;
        node.next = null;
        tail.next = node;
        tail = node;
        size++;

    }

    public void addIndex(int index, int value) {
        if (index == 0) {
            addFirst(value);
            return;
        }
        if (index == size - 1) {
            addLast(value);
            return;
        }
        size++;
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next, temp);
        temp.next = node;
        node.next.prev = node;

        // node.next = temp.next;
        // temp.next.prev = node;
        // temp.next = node;
        // node.prev = temp;
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
        head.prev = null;
    }

    public void deleteLast() {
        if (tail == null) {
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }

    public Node find(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == value) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void addAfter(int after, int value) {

        Node P = find(after);
        if (P == null) {
            System.out.println("Such Node Doesn't Exixt\n");
            return;
        }
        Node node = new Node(value);
        node.next = P.next;
        P.next = node;
        node.prev = P;
        if (node.next != null) {
            node.next.prev = node;
        }

    }

}
