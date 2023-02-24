import java.util.ArrayList;

public class Priority_queue {

    private ArrayList<Integer> heap;
    // Constructer

    public Priority_queue() {
        heap = new ArrayList<>();
    }

    boolean isEmpty() {
        return heap.size() == 0;
    }

    int size() {
        return heap.size();
    }

    int getMin() throws Priority_Queue_Exception {
        if (heap.isEmpty()) {
            // Throw an exception
            throw new Priority_Queue_Exception();
        }
        return heap.get(0);
    }

    void insert(int element) {
        heap.add(element);

        int childIndex = heap.size() - 1;
        int parentIndex = (childIndex - 1) / 2;

        while (childIndex > 0) {
            if (heap.get(childIndex) < heap.get(parentIndex)) {
                int temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);

                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            } else {
                return;
            }
        }
    }

    int removeMin() throws Priority_Queue_Exception {

        if (heap.isEmpty()) {
            // Throw an exception
            throw new Priority_Queue_Exception();
        }
        int temp = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        // Downward heapify
        int index = 0;
        int minIndex = index;
        int leftIndex = 1;
        int rightIndex = 2;

        while (leftIndex < heap.size()) {
            if (heap.get(leftIndex) < heap.get(minIndex)) {
                minIndex = leftIndex;
            }

            if (rightIndex < heap.size() && heap.get(rightIndex) < heap.get(minIndex)) {
                minIndex = rightIndex;
            }
            if (minIndex == index) {
                break;
            } else {
                int temp1 = heap.get(index);
                heap.set(index, heap.get(minIndex));
                heap.set(minIndex, temp1);

                index = minIndex;
                leftIndex = 2 * index + 1;
                rightIndex = 2 * index + 2;
            }
        }
        return temp;

    }

    public static void main(String[] args) throws Priority_Queue_Exception {

        Priority_queue pq = new Priority_queue();
        int arr[] = { 5, 6, 1, 2, 3, 1, 2, 4, 9, 14, 3 };
        for (int i = 0; i < arr.length; ++i) {
            pq.insert(arr[i]);
        }
        while (!pq.isEmpty()) {
            System.out.print(pq.removeMin() + "  ");
        }
    }
}
