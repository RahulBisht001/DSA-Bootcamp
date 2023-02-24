// Stack Implementation 
//By : Apna Collage
public class StackLL {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static class Stack {
        private static Node head;

        public boolean isEmpty() {
            return head == null;
        }

        /*
         * Push Function Using Linked List
         * It is Nothing ; Insertion at Head in LL . Simple
         */
        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            } else {
                newNode.next = head;
                head = newNode;
            }
            return;
        }

        /*
         * Pop Function Using Linked List
         * It is Nothing ; Deletion at Head in LL . Simple
         */
        public int pop() {
            // Case 1: (Edge case)
            // When Stack is Empty we can't Pop anything
            if (isEmpty()) {
                return -1;
            }
            // case 2:
            int top = head.data;
            head = head.next;
            return top;
        }

        /*
         * Peek Function Using Linked List
         * It is Nothing ; just returning the data of the Head in LL . Simple
         */

        public int peek() {

            // Case 1:
            if (isEmpty()) {
                return -1;
            }
            // Case 2:
            return head.data;
        }
    }

    public static void main(String[] args) {

        /*
         * Main Operations In Stack
         * 1. Push() :O(1) time
         * 2.Pop() :O(1) time
         * 3.Peek() : O(1) time
         * 
         * Last In Fast Out ( LIFO Principle)
         */
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        while (!s.isEmpty()) {
            System.out.print(s.pop() + "  ");

        }

    }
}
