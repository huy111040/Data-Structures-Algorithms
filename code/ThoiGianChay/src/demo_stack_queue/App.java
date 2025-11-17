package demo_stack_queue;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("----------DEMO: CAI DAT STACK VOI MANG----------");
        // MyArrayStack myArrayStack=new MyArrayStack(10);
        // myArrayStack.push(5);
        // myArrayStack.push(6);
        // myArrayStack.push(7);
        // myArrayStack.push(8);
     
        // myArrayStack.show();
        // System.out.println("lay mot phan tu o dau stack có gia tri la: "+myArrayStack.pop());
        // System.out.println("lay mot phan tu o dau stack có gia tri la: "+myArrayStack.pop());
        // myArrayStack.show();
        // System.out.println("lay mot phan tu o dau stack có gia tri la: "+myArrayStack.pop());
        // System.out.println("lay mot phan tu o dau stack có gia tri la: "+myArrayStack.pop());
        // System.out.println("lay mot phan tu o dau stack có gia tri la: "+myArrayStack.pop());
        // myArrayStack.show();

        // System.out.println("----------DEMO: CAI DAT QUEUE VOI MANG----------");
        // MyArrayQueue myArrayQueue=new MyArrayQueue(4);
        // myArrayQueue.push(5);
        // myArrayQueue.push(6);
        // myArrayQueue.push(7);
        // myArrayQueue.push(8);
        
        // myArrayQueue.show();
        // System.out.println("lay mot phan tu có gia tri la: "+myArrayQueue.pop());
        // myArrayQueue.show();
        // System.out.println("lay mot phan tu có gia tri la: "+myArrayQueue.pop());
        // System.out.println("lay mot phan tu có gia tri la: "+myArrayQueue.pop());
        // System.out.println("lay mot phan tu có gia tri la: "+myArrayQueue.pop());
        // System.out.println("lay mot phan tu có gia tri la: "+myArrayQueue.pop());
        // myArrayQueue.show();

        // System.out.println("----------DEMO: CAI DAT STACK VOI LINKED LIST----------");
        // MyLinkedListStack myLinkedListStack=new MyLinkedListStack();
        // myLinkedListStack.push(1);
        // myLinkedListStack.push(3);
        // myLinkedListStack.push(5);
        // myLinkedListStack.push(7);
        // myLinkedListStack.show();
        // System.out.println("lay mot phan tu có gia tri la: "+myLinkedListStack.pop());
        // System.out.println("lay mot phan tu có gia tri la: "+myLinkedListStack.pop());
        // myLinkedListStack.show();
        // System.out.println("lay mot phan tu có gia tri la: "+myLinkedListStack.pop());
        // System.out.println("lay mot phan tu có gia tri la: "+myLinkedListStack.pop());
        // System.out.println("lay mot phan tu có gia tri la: "+myLinkedListStack.pop());
        // myLinkedListStack.show();

         System.out.println("----------DEMO: CAI DAT QUEUE VOI LINKED LIST----------");
         MyLinkedListQueue myLinkedListQueue=new MyLinkedListQueue();
         myLinkedListQueue.push(5);
         myLinkedListQueue.push(10);
         myLinkedListQueue.push(15);
         myLinkedListQueue.push(20);
         myLinkedListQueue.show();
         System.out.println("lay mot phan tu có gia tri la: "+myLinkedListQueue.pop());
        System.out.println("lay mot phan tu có gia tri la: "+myLinkedListQueue.pop());
        myLinkedListQueue.show();
        System.out.println("lay mot phan tu có gia tri la: "+myLinkedListQueue.pop());
        System.out.println("lay mot phan tu có gia tri la: "+myLinkedListQueue.pop());
        System.out.println("lay mot phan tu có gia tri la: "+myLinkedListQueue.pop());
        myLinkedListQueue.show();
        System.out.println("----------DEMO: CAI DAT STACK VOI LINKED LIST----------");

        MyLinkedListStack myLinkedListStack = new MyLinkedListStack();

        myLinkedListStack.push(5);
        myLinkedListStack.push(10);
        myLinkedListStack.push(15);
        myLinkedListStack.push(20);

        myLinkedListStack.show();

        System.out.println("lay mot phan tu co gia tri la: " + myLinkedListStack.pop());
        System.out.println("lay mot phan tu co gia tri la: " + myLinkedListStack.pop());

        myLinkedListStack.show();

        System.out.println("lay mot phan tu co gia tri la: " + myLinkedListStack.pop());
        System.out.println("lay mot phan tu co gia tri la: " + myLinkedListStack.pop());
        System.out.println("lay mot phan tu co gia tri la: " + myLinkedListStack.pop());  // sẽ báo rỗng

        myLinkedListStack.show();


    }
}
