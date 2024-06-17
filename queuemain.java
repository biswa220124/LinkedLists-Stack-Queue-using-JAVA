public class queuemain {
    public static void main(String[] args) {
        Queue q1 = new Queue(5);
        q1.enqueue(5);
        q1.enqueue(7);
        q1.dequeue();
        q1.printQueue();
    }
}
