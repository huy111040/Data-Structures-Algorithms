package SINGLYLINKEDLIST1;

public class MyLinkedList {
    Node head;

    public void createList(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void displayList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void insertHead(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertTail(int value) {
        createList(value);
    }

    public void insertAt(int value, int position) {
        if (position == 0) {
            insertHead(value);
            return;
        }

        Node newNode = new Node(value);
        Node temp = head;

        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Vị trí không hợp lệ!");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteHead() {
        if (head == null) return;
        head = head.next;
    }

    public void deleteTail() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    public void deleteAt(int position) {
        if (head == null) return;

        if (position == 0) {
            deleteHead();
            return;
        }

        Node temp = head;

        for (int i = 0; i < position - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Vị trí không hợp lệ!");
            return;
        }

        temp.next = temp.next.next;
    }

    public int search(int key) {
        Node temp = head;
        int position = 0;

        while (temp != null) {
            if (temp.data == key) {
                return position;
            }
            temp = temp.next;
            position++;
        }

        return -1;
    }

    public Node reverseIterative() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;

            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    public Node reverseRecursive(Node node) {
        if (node == null || node.next == null)
            return node;

        Node newHead = reverseRecursive(node.next);
        node.next.next = node;
        node.next = null;

        return newHead;
    }
}
