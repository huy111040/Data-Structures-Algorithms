package demo_stack_queue;

//https://cafedev.vn/ctdl-queue-hang-doi-phan-1-gioi-thieu-ve-queue-va-cai-dat-queue-bang-mang-mot-chieu/
public class MyArrayQueue implements IStackQueue {
private int[] array;
private final int size;
private int headIndex; //thêm vào đầu
private int tailIndex; //lấy ra ở đuôi
   
    public MyArrayQueue(int size) {
    this.size = size; //kích thước tối đa của mảng
    array=new int[size];
    headIndex=-1;
    tailIndex=-1;
}

    @Override
    //thêm vào phần đuôi của mảng
    public boolean push(int value) { 
        if(isFull()){
            System.out.println("The queue is full");
            return false;
        }
        if(isEmpty()) headIndex++; //cả head và tail đều trỏ vào pt 0
        tailIndex++;
        array[tailIndex]=value;
        return true;

    }
    @Override
    //lấy phần tử đầu của mảng
    public int pop() {
        int result=Integer.MIN_VALUE;
        if(isEmpty()) 
        {
            System.out.println("Queue is empty");
            return result;
        }
        result=array[headIndex];
        if(headIndex==size-1) //head và tail đều ở cuối mảng
            headIndex=tailIndex=-1;
        else headIndex++;
        //trường hợp stack có một phần tử, lúc này head vượt qua tail 
        if(headIndex>tailIndex) headIndex=tailIndex=-1;
        return result;
    }

    @Override
    public boolean isEmpty() {
        return (tailIndex==-1&&headIndex==-1);
    }
    @Override
    public boolean isFull() {
        return tailIndex==size-1; 
        
    }
    @Override
    public void show() {
        if(!isEmpty()){
            for (int i = headIndex; i <= tailIndex; i++) {
                System.out.print(array[i]+"   ");
            }
            System.out.println();
        }
        else
            System.out.println("Queue is empty");
    }
}
