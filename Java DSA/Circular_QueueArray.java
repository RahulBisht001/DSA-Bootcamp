// Apna Collage
public class Circular_QueueArray {

    static class CircularQueue {
        static int arr[];
        int size;
        static int front = -1;
        static int rare = -1;

        CircularQueue(int size) {
            arr = new int[size];
            this.size = size;
        }

        public boolean isEmpty() {
            return rare == -1 && front == -1;
        }

        public boolean isFull() {
            return (rare + 1) % size == front;
        }

        // add Function
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            rare = (rare + 1) % size;
            if (front == -1)
                front = 0;

            arr[rare] = data;
        }

        // Remove Function
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int result = arr[front];
            // Single Element Condition (When there is Only one element )
            if (front == rare) {
                rare = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(100);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        while (!q.isEmpty()) {
            System.out.print(q.remove() + "  ");
        }
    }
}
