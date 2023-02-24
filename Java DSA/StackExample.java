import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        // Code
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        deleteMid(s, 4);
        while (!(s.isEmpty())) {
            System.out.print(s.pop() + " ");
        }
    }

    public static void deleteMid(Stack<Integer> s, int sizeOfStack) {
        // code here
        int mid = (int) (Math.ceil(sizeOfStack + 1) / 2);
        delete(s, mid);
        return;

    }

    public static void delete(Stack<Integer> s, int mid) {
        if (mid > 1) {
            mid--;
            int top = (int) s.pop();
            delete(s, mid);
            s.push(top);
            return;

        }
        s.pop();
        return;
    }

    public static void pushAtBottom(Stack<Integer> s) {

        if (!(s.isEmpty())) {
            int ans = (int) s.pop();
            pushAtBottom(s);
            s.push(ans);
        } else {
            s.push(100);
        }

    }
}
