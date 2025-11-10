package Singlylinkedlist;

public class App {

    public static void main(String[] args) throws Exception {
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.insertHead(5);
        myList.insertHead(7);
        myList.insertHead(10); //đầu
        myList.insertTail(15);
        myList.insertTail(20);
        myList.insertToIndex(100, 0);
        myList.insertToIndex(200, 1);
        myList.insertToIndex(300, 2);
        myList.printList();
        int search = 3000;
        int position = myList.searchByValue(search);
        if (position == -1)
            System.out.printf("không tìm thấy phần tử có giá trị %d trong list %n", search);
        else
            System.out.printf("Vị trí tìm thấy %d là %d %n", search, position);
        myList.deleteAtIndex(2); //tính từ 0
        myList.deleteAtIndex(1); //tính từ 0
        myList.printList();
    }

}
