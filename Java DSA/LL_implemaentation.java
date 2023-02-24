//Kunal  Kushwaha DSA Bootcamp
public class LL_implemaentation {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
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

    public int size() {
        return size;
    }

    public void addFirst(int value) {

        Node node = new Node(value);
        node.next = head;
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
        size++;
        Node node = new Node(value);
        tail.next = node;
        tail = node;

    }

    public void addIndex(int index, int value) {
        if (index == 0) {
            addFirst(value);
            return;
        }
        if (index == size) {
            addLast(value);
            return;
        }
        size++;
        // indexes 0 1 2 3 4 5
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
    }

    public int deleteFirst() {
        if (head == null) {
            System.out.println("Empty Linked list");
            return Integer.MIN_VALUE;
        }
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {

        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int deleteIndex(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        // 0 1 2 3 4
        // 10 20 30 40 50
        size--;
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;

    }

    private Node get(int index) {
        Node temp = head;
        // 0 1 2 3 4
        // 10 20 30 40 50
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;

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

}
