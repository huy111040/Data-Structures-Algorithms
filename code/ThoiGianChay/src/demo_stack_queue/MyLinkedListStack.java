package demo_stack_queue;

public class MyLinkedListStack implements IStackQueue {
    Node topNode;
    @Override
    //thêm vào đầu
    public boolean push(int value) {
        Node newNode=new Node(value);
        if(isEmpty()) topNode=newNode;
        else {
            newNode.next=topNode;
            topNode=newNode;
        }
        return true;
    }
    @Override
    //lấy ra ở đầu, nếu stack rỗng thì trả về Integer.MIN_VALUE
    public int pop() {
        int result=Integer.MIN_VALUE;
        if(!isEmpty()){
            Node next=topNode.next;
            result=topNode.value;
            topNode=next;
        }
        return result;
    }

    @Override
    public boolean isEmpty() {
        return topNode==null;
    }
    //LinkedList không giới hạn số phần tử nên không cần sử dụng pt này
    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isFull'");
    }

    @Override
    public void show() {
        Node currentNode=topNode;
        while(currentNode!=null){
            System.out.print(currentNode);
            currentNode=currentNode.next;
        }
        System.out.println("null");
    }

}
