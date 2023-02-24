public class LL_ex {
    public static void main(String[] args) {
        LL_implemaentation list = new LL_implemaentation();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addLast(1000);
        list.addLast(22);
        list.addIndex(3, 333);
        list.deleteFirst();
        list.display();
        System.out.println(list.size());
        // System.out.println(list.deleteFirst());
        // list.display();
        // System.out.println(list.size());
        // System.out.println(list.deleteIndex(4));
        // System.out.println(list.find(30));
        list.display();

        // System.out.println(list.size());

    }
}
