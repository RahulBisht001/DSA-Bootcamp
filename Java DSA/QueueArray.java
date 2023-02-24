// Code From Apna Collage  
/*
 * Operations On Queue
 * 1. Add (Enque)
 * 
 * 2. Remove (DeQueue) ### Mind it is deifferent front Deque
 * 
 * 3. Front (peek)
 */
public class QueueArray {
    /*
     * Front
     * Rare
     * Implementation using Array
     */
    static class Queue {
        static int arr[];
        int size;
        static int rare = -1;
        static int front = -1;

        Queue(int size) {
            arr = new int[size];
            this.size = size;
        }

        /*
         * isEmpty Function
         * Check whther Queue is Empty or not
         */
        public boolean isEmpty() {
            return rare == -1;
        }

        /*
         * add Function for Queue
         * Front will be same but rare will Move
         */
        public void add(int data) {
            if (rare == size - 1) {
                System.out.println("Queue is FULL");
                return;
            }
            rare++;
            arr[rare] = data;
        }

        /*
         * Remove Operation
         * Dequeue
         */
        public int remove() {
            if (rare == -1) {
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rare; ++i) {
                arr[i] = arr[i + 1];
            }
            --rare;
            return front;
        }

        /*
         * peek function
         */
        public int peek() {
            if (rare == -1) {
                return -1;
            }
            return arr[0];
        }

    }

    public static void main(String[] args) {

        Queue q = new Queue(50);
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
