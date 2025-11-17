package SINGLYLINKEDLIST1;

public class App {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.createList(10);
        list.createList(20);
        list.createList(30);

        System.out.println("Danh sách ban đầu:");
        list.displayList();

        list.insertHead(5);
        list.insertTail(40);
        list.insertAt(15, 2);

        System.out.println("Sau khi thêm phần tử:");
        list.displayList();

        list.deleteHead();
        list.deleteTail();
        list.deleteAt(1);

        System.out.println("Sau khi xoá phần tử:");
        list.displayList();

        int pos = list.search(20);
        System.out.println("Tìm thấy 20 tại vị trí: " + pos);

        list.reverseIterative();
        System.out.println("Đảo ngược bằng vòng lặp:");
        list.displayList();

        list.head = list.reverseRecursive(list.head);
        System.out.println("Đảo ngược bằng đệ quy:");
        list.displayList();
    }
}
