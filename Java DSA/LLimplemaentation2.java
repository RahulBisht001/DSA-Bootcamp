//Kunal  Kushwaha DSA Bootcamp
public class LLimplemaentation2 {
    private static Node head;
    private Node tail;
    private int size;

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
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

    public static void main(String[] args) {

        // code here
        LLimplemaentation2 list = new LLimplemaentation2();
        list.addLast(11);
        list.addLast(11);
        list.addLast(11);
        list.addLast(11);
        list.addLast(75);
        list.addLast(75);

        list.display();
        System.out.println();
        Node ans = new Node(Integer.MIN_VALUE);
        ans.next = head;
        Node prev = ans;
        Node curr = head;
        int key = Integer.MIN_VALUE;

        while (curr != null) {

            if (prev.value == curr.value) {
                prev.next = curr.next;
                curr = curr.next;
                key = prev.value;
                continue;
            } else if (key != Integer.MIN_VALUE) {
                int temp = curr.value;
                curr.value = prev.value;
                prev.value = temp;
                prev.next = curr.next;
                curr = curr.next;
                key = Integer.MIN_VALUE;
                continue;
            }

            prev = curr;
            curr = curr.next;
        }

        if (key != Integer.MIN_VALUE) {
            prev = null;
        }
        // return ans.next;
        list.display();
    }
}
