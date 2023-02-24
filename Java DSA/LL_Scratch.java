// Apna Collage
public class LL_Scratch {
    private Node head;
    private int size;

    LL_Scratch() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public static void main(String[] args) {

        LL_Scratch list = new LL_Scratch();

        list.addFirst("Bisht");
        list.addFirst("Rahul");
        list.addFirst("is");
        list.addFirst("this");
        list.display();
        list.addLast("Yo");
        list.addLast("Bandd");
        list.display();
        list.deleteLast();
        list.display();
        list.deleteFirst();
        list.display();

        System.out.println(list.getSize());

    }

    public void display() {
        Node temp = head;
        if (head == null) {
            System.out.println("Empty List");
        }
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("I am NULL");
    }

    public int getSize() {
        return size;
    }

    public void addFirst(String data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            // Corner case 1:
            // if the list is empty
            // means head is pointing to null;
            System.out.println("List is Empty");
            return;
        }
        // Corner Case 2:
        // when there is Only One Chacater
        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        // Genral case:
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

}
