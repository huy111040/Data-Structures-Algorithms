package demo_stack_queue;

public class MyLinkedListQueue implements IStackQueue {
    Node headNode,tailNode;   
    @Override
    //thêm một phần tử vào cuối
    public boolean push(int value) {
        Node newNode=new Node(value);
        if(isEmpty()) {
            headNode=newNode;
            tailNode=newNode;
        }
        else {
            tailNode.next=newNode;
            tailNode=newNode;
        }
        return true;
    }

    @Override
    //lấy một phần tử ở đầu
    public int pop() {
        int result=Integer.MIN_VALUE;
        if(isEmpty()){
            System.out.println("Queue is empty");
            return result;
        }
        result=headNode.value;
        //nếu có 1 phần tử
        if(tailNode==headNode) {
            
            headNode=tailNode=null;    
        }
        else{
            headNode=headNode.next;
        }
        return result;
    }

    @Override
    public boolean isEmpty() {
         return headNode==null && tailNode==null;
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isFull'");
    }

    @Override
    public void show() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        Node currentNode=headNode;
        while(currentNode!=null){
            System.out.print(currentNode);
            currentNode=currentNode.next;
        }
        System.out.println("null");
    }
    
}
