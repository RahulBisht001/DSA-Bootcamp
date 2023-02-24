public class Function_overloding {
    public static void main(String[] args) {
        // code
        // String name = "Rahul";
        fun(69);
        fun(55, 87);
    }

    static void fun(int i) {
        System.out.println(i);
    }

    static void fun(int x, int y) {
        System.out.println(x + " " + y);
    }

}
