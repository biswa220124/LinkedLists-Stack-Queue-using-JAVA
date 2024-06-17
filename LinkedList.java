class Node{
    int value;
    Node next;
    Node(int value){
        this.value = value;
    }
}
public class LinkedList{
    Node Head;
    Node tail;
    int length=0;

    public LinkedList(int value){
        Node newNode1 = new Node(value);
        Head = newNode1;
        tail = newNode1;
        length++;
    }
    public void printlist(){
        Node temp = Head;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getHead(){
        System.out.println("Head Element value is:"+ Head.value);
    }
    public void getTail(){
        System.out.println("Tail element is:"+ tail.value);
    }
    public void getLength(){
        System.out.println("Length equals to:"+ length);
    }
    public void append(int value){
        Node newNode1 = new Node(value);
        if(length==0){
            Head = newNode1;
            tail = newNode1;
        }
        else{
            tail.next = newNode1;
            tail = newNode1;
        }
        length++;
    }
    public Node removelast(){
        Node temp = Head;
        Node pre = Head;
        if(length==0) return null;
        while(temp.next!=null){
            temp = pre;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length==0){
            Head = null;
            tail = null;
        }
        return temp;
    }
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length==0){
            Head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = Head;
            Head = newNode;
        }
        length++;

    }
    public Node removeFirst(){
        if(length==0) return null;
        Node temp = Head;
        Head = Head.next;
        temp.next = null;
        length--;
        if(length==0)
            tail = null;
        return temp;

    }
    public Node get(int index){
        if(index<0 || index>=length) return null;
        Node temp =  Head;
        for(int i=0; i<index;i++){
            temp = temp.next;

        }
        return temp;
    }
    public boolean set(int value, int index){
        Node temp = get(index);
        if(temp!=null){
            temp.value = value;
            return true;
        }
        return false;
    }
    public boolean insert(int value, int index){
        if(index<0 || index>length) return false;
        if(index==0){
            prepend(value);
            return true;
        }
        if(index== length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index-1);
        newNode.next = temp.next;
        temp.next = newNode;
        return true;

    }
    public Node remove(int index){
        if(index<0 || index>=length  ) return null;
        if(index==0){
            return removeFirst();
        }
        if(index==length-1){
            return removelast();
        }
        Node temp = get(index);
        Node pre = get(index-1);
        pre.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }



}