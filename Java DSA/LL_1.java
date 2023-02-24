import java.util.LinkedList;

public class LL_1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        int x = list.size();
        System.out.println(x);

        list.remove(1);
        System.out.println(list.size());
    }
}
