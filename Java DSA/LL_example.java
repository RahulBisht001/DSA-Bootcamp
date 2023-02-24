//import java.util.LinkedList;

public class LL_example {
    public static void main(String[] args) {
        // code
        LL_imp list = new LL_imp();
        // list.insertFirst(10);
        // list.insertFirst(20);
        // list.insertFirst(30);
        // list.insertFirst(40);
        // list.insertFirst(50);

        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(50);

        list.display();
        System.out.println(list.size());

    }
}
