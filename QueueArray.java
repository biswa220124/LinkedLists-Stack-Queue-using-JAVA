public class QueueArray{
    int[] queue;
    int rear;
    int front;
    int size;

    public QueueArray(int size){
        queue = new int[size];
        front = -1;
        rear = -1;
        size = 0;
    }
    public void enQueue(int value){
        if(rear!= queue.length-1){
            rear++;
            queue[rear] = value;
            size++;
        }
    }
    public int deQueue(){
        int value = 0;
        if(front!=-1){
            front++;
            queue[front] = value;
            size--;
        }
        return value;
    }
    public boolean isEmpty(){
        boolean response = false;
        if(size==0){
            response = true;
            return response;
        }
        return response;
    }
    public boolean isFull(){
        boolean response = false;
        if(queue.length == size){
            response = true;
            return response;
        }
        return response;
    }

}