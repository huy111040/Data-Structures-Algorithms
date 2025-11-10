package Singlylinkedlist;

public class SinglyLinkedList {
    Node head;

    //in linked list
    public void printList() {
        if (head == null) //danh sách rỗng
        {
            System.out.println("Empty list");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp);
            temp = temp.next;
        }
        System.out.println("null");
    }

    //thêm một phần tử có data là x vào đầu của list
    public void insertHead(int x) {
        //b1 tạo nút chứa data là x
        Node newNode = new Node(x);
        if (head == null)
            head = newNode;
            //nút mới trỏ vào nút đầu, do head đang trỏ
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    //thêm một phần tử có data là x vào cuối của list
    public void insertTail(int x) {
        //b1 tạo nút chứa data là x
        Node newNode = new Node(x);
        if (head == null)
            head = newNode;
            //nút mới trỏ vào nút đầu, do head đang trỏ
        else {
            //tìm đến phần tử cuối danh sách, next=null
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            //temp đang trỏ vào phần tử cuối
            temp.next = newNode;
        }
    }

    //thêm một phần tử có data là x vào vị trí index,index tính từ 0
    public void insertToIndex(int x, int index) {
        if (index == 0) insertHead(x);
        else {
            int count = 0;
            Node temp = head;
            Node newNode = new Node(x);
            while (temp != null) {
                count++;
                if (index == count) {
                    newNode.next = temp.next;
                    temp.next = newNode;
                }
                temp = temp.next;
            }
        }
    }

    public int searchByValue(int search) {
        int index = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == search)
                return index;
            index++;
            temp = temp.next;
        }
        return -1;
    }

    //xoá phần tử đầu tiên của list
    public void deleteHead() {
        if (head == null) return; //danh sách rỗng
        Node temp = head;
        head = head.next;
        temp.next = null; //xoá liên kết

    }

    // xoá phần tử cuối cùng của list
    public void deleteTail() {
        if (head == null) return; //danh sách rỗng
        if (head.next == null) {
            head = null;
            return;
        }
        Node prev = head;
        Node cur = head.next;
        while (cur.next != null) {
            prev = cur;
            cur = cur.next;
        }
        prev.next = null;

    }
    // xoá phần tử tại vị trí index
    public void deleteAtIndex(int index) {
        if (head == null) return; //danh sách rỗng
        if (index == 0) {
            deleteHead();
            return;
        }
        int count = 0;
        Node prev = head;
        Node cur = head.next;
        while (cur != null) {
            count++;
            if (count == index) {
                prev.next = cur.next;
                cur.next = null;
                return;
            }
            prev = cur;
            cur = cur.next;
        }
    }
}