public class DLL_ex {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.addFirst(30);
        list.addFirst(40);
        list.addFirst(50);
        list.addFirst(60);
        list.addLast(10);
        list.addLast(20);
        list.addLast(90);
        list.addIndex(6, 5000);
        list.addAfter(20, 2000);
        list.display();
        System.out.println();
        list.deleteFirst();
        list.deleteFirst();
        list.deleteLast();

        list.display();
        // list.displayReverse();

    }
}
