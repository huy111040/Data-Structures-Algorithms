package myqueue;



public class MyListQueue {
    Node head, tail;

    //thêm phần tử vào hàng đợi, vị trí head
    public void push(int val) {
        Node newNode = new Node(val);
        //trường hợp hàng đợi rỗng
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    //in hàng đợi
    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp);
            temp = temp.next;
        }
        System.out.println("null");
    }

    //lấy phần tử từ đuôi tail
    public int pop() {
        int kq = Integer.MIN_VALUE;
        if (isEmpty()) return kq;
    //nếu list có một node
        if (head == tail) {
            kq = tail.value;
            head = tail = null;
            return kq;
        }
        //có từ hai node trở lên
        Node prev = head; //Node phía trước
        Node cur = head.next; //node hiện tại
        //di chuyển cur đến node cuối cùng của list
        while (cur.next != null) {
            prev = cur;
            cur = cur.next;
        }
        //cur đang ở vị trí node cuối cùng, prev kề cuối
        kq = cur.value;
        tail = prev;
        prev.next = null; //bỏ node cuối
        return kq;
    }

    //kiểm tra hàng đợi có rỗng không?
    public boolean isEmpty() {
        return (head == null & tail == null);
    }

    //Tìm vị trí của một phần tử trong hàng đợi,không tìm thấy trả về -1
    public int searchNode(int value) {
        if (isEmpty()) return -1;
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.value == value) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }
}
