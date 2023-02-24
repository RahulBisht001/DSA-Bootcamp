import java.util.Stack;

public class PostFix {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        String ans = "";
        String s = "A*(B+C)/D";

        for (int i = 0; i < s.length(); ++i) {

            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9') {
                ans += c;

            } else if (c == '(') {
                st.push(c);
            } else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans += st.pop();
                }
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                while (!st.isEmpty() && prec(st.peek()) > prec(c)) {
                    ans += st.pop();
                }
                st.push(c);
            }
        }
        while (!st.isEmpty()) {
            ans += st.pop();
        }
        System.out.println(ans);
    }

    public static boolean isOpertor(char c) {
        return false;
    }

    public static int prec(char c) {
        if (c == '^') {
            return 3;
        } else if (c == '*' || c == '/') {
            return 2;
        } else if (c == '+' || c == '-') {
            return 1;
        } else
            return -1;
    }

    public static boolean isOperator(char c) {
        if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9') {
            return false;
        }
        return true;
    }

}
