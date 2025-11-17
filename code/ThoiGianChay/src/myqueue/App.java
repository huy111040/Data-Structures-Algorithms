package myqueue;

public class App {
    public static void main(String[] args) throws Exception {
        MyListQueue myQueue = new MyListQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);
        myQueue.show();
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        myQueue.show();
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        myQueue.show();


    }
}
