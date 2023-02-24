import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.toString());
        stackReverse(s);
        System.out.println(s.toString());
    }

    public static void stackReverse(Stack<Integer> s) {

        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        stackReverse(s);
        pushAtBottom(s, top);
    }

    public static void pushAtBottom(Stack<Integer> s, int data) {

        if (!(s.isEmpty())) {
            int ans = (int) s.pop();
            pushAtBottom(s, data);
            s.push(ans);
        } else {
            s.push(data);
        }

    }
}
