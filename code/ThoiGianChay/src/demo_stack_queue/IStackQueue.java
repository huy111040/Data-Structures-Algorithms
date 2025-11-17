package demo_stack_queue;

public interface IStackQueue{
    boolean push (int value); //mảng có thể đầy nên trả về true/false để biết kq
    int pop (); //lấy ra một phần tử
    boolean isEmpty ();
    boolean isFull (); //đối với mảng
    void show();
}