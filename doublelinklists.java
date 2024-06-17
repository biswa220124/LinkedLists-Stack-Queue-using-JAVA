
public class doublelinklists {
     class Node{
        int value;
        Node next;
        Node prev;
        public Node(int value){
            this.value = value;
        }
    }
     Node head;
     Node tail;
     int length;
    public doublelinklists(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length=1;
    }
    public void getHead(){
        System.out.println("Head value is: "+ head.value);
    }
    public void getTail(){
        System.out.println("Tail value is: "+tail.value);
    }
    public void getLength(){
        System.out.println("Length is: "+length);
    }
    public void printlist(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void append(int value){
        Node newNode = new Node(value);
        if(length==0){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;

        }
        length++;

    }
    public Node removeLast(){
        if(length==0) return null;
        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
        length--;

        if(length==0){
            head = null;
            tail = null;

        }
        return temp;

    }
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length==0){
            head = newNode;
            tail = newNode;
        }
        else{
            head.prev = newNode;
            newNode.next = head;
            head = head.prev;
            length++;
        }


    }
    public Node removeFirst(){
        if(length==0){
            return null;
        }
        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
        length--;
        if(length==0){
            head = null;
            tail = null;
        }
        return temp;


    }
    public Node getIndex(int index){
        if(index<0 || index>=length) return null;
        Node temp = head;
        if(index< length/2){
            for(int i=0; i<index;i++){
                temp = temp.next;

            }
        }
        else{
            temp = tail;
            for(int i = length-1; i>index; i--){
                temp = temp.prev;
            }
        }
        return temp;
    }
public boolean setIndex(int index, int value){
        Node temp = getIndex(index);
        if(temp!=null){
            temp.value = value;
            return true;
        }
        return false;
}
public boolean insert(int index, int value){
        if(index<0 || index>=length) return false;
        Node newNode = new Node(value);
        if(index==0){
            prepend(value);
            return true;
        }
        if(index== length-1){
            append(value);
            return true;
        }
        Node before = getIndex(index-1);
        Node after = before.next;
        newNode.prev = before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;
        length++;
        return true;



}
public Node remove(int index){
        if(index<0|| index>=length) return null;
        if(index==0){
            removeFirst();
        }
        if(index==length-1){
            removeLast();
        }
        Node before = getIndex(index-1);
        Node after = getIndex(index+1);
        Node temp = getIndex(index);
        temp.prev = null;
        temp.next = null;
        before.next = after;
        after.prev = before;
        length--;
        return temp;
}

}

