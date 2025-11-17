package demo_stack_queue;

public class MyArrayStack implements IStackQueue {

    private int[] array;
    private int size; //số phần tử tối đa của mảng
    private int topIndex; //chứa chỉ số của phần tử cuối cùng của mảng (trên cùng)
    
    public MyArrayStack(int size) {
        this.size = size;
        array=new int[size];
        topIndex=-1; //
    }
    //thêm một phần tử vào Stack
    @Override
    public boolean push(int value) {
        if(!isFull()) 
        {
            topIndex++;
            array[topIndex]=value;
            return true;
        }
        return false;
    }
    //lấy một phần tử vào Stack, stack rỗng thì return về gt NN của kiều Integer
    @Override
    public int pop() {
        if(!isEmpty())
        {
            int result= array[topIndex];
            topIndex--;
            return result;
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public boolean isEmpty() {
        return topIndex==-1;
    }

    @Override
    public boolean isFull() {
        return topIndex==size-1;
    }

    @Override
    public void show() {
        if(isEmpty()) 
        {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = topIndex; i >=0 ; i--) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    
}
