package mystack;

public class MyStack {
    Node topNode;
    public void push (int value){
//Thêm vào đầu
        Node newNode=new Node(value);
        newNode.next=topNode;
        topNode=newNode;
    }
    //lấy phần tử ở đầu stack
    public int pop (){
//Xoá phần tử đầu của List;
        if(topNode==null) return Integer.MIN_VALUE;
        Node temp=topNode;
        int kq=temp.value;
        topNode=temp.next;
        temp.next=null;
        return kq;
    } //lấy ra một phần tử
    public boolean isEmpty (){
        return topNode==null;
    }
    public void show(){
        if(topNode==null) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp=topNode;
        while(temp!=null){
            System.out.print(temp);
            temp=temp.next;
        }
        System.out.println("null");
    }
}
