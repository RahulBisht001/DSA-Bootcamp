// Stack Implementation By Kunal Kushwaha

// import java.util.ArrayDeque;
// import java.util.Deque;
//import java.util.Stack;

public class CustomStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int top = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is Full");
            return false;
        }
        data[++top] = item;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Can't POP from an Empty stack");
        }
        return data[top--];
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Can't Peek from an Empty stack");
        }
        return data[top];
    }

    private boolean isFull() {
        return top == data.length - 1;
    }

    private boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) throws Exception {

        CustomStack st = new CustomStack(5);
        st.push(100);
        st.push(200);
        st.push(300);
        st.push(400);
        st.push(3000);

        for (int i = 0; i < 5; ++i) {
            System.out.println(st.pop());
        }

    }
}

/*
 * // Deque
 * Deque<Integer> deque = new ArrayDeque<>();
 * deque.add(10);
 * deque.addFirst(20);
 * deque.addLast(30);
 * deque.add(40);
 * deque.add(40);
 * deque.add(40);
 * deque.add(50);
 * deque.add(60);
 * 
 * System.out.println(deque.removeLastOccurrence(40));
 */