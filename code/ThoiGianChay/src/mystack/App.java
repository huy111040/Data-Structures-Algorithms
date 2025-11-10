package mystack;

public class App {
    public static void main(String[] args) {
        MyStack myStack=new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.show();
        System.out.println(myStack.pop());
        System.out.println(myStack.isEmpty());
        myStack.show();
    }
}
