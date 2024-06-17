public class Queue {
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    private Node first;
    private Node last;
    private int length;
    public Queue(int value){
        Node newQueue = new Node(value);
        first = newQueue;
        last = newQueue;
        length++;
    }
    public void printQueue(){
        Node temp = first;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getFirst(){
        System.out.println("First Value is: "+ first.value);
    }
    public void getLast(){
        System.out.println("Last value is: "+ last.value);
    }
    public void enqueue(int value){
        Node newNode = new Node(value);
        if(length==0){
            first = newNode;
            last = newNode;
        }
        else{
           last.next = newNode;
           last = newNode;
        }
        length++;
    }
    public Node dequeue(){
        Node temp = first;
        if(length==0) return null;
        if(length==1){
            first = null;
            last = null;
        }
        else{
            first = first.next;
            temp.next = null;

        }
        length--;
        return temp;

    }

}
