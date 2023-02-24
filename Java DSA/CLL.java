public class CLL {
    private Node head;
    private Node tail;
    private int size;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        CLL list = new CLL();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        list.display();

    }

    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println("HEAD");
    }

    public int getSize() {
        return size;
    }

    public void add(int value) {
        Node node = new Node(value);
        size++;
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int val) {
        Node temp = head;
        if (head == null) {
            return;
        }
        if (head.value == val) {
            head = head.next;
            tail.next = head;
            size--;
            return;
        }
        size--;

        do {
            Node n = temp.next;
            if (n.value == val) {
                temp.next = n.next;
                break;
            }
            temp = temp.next;
        } while (temp != head);

    }

}
