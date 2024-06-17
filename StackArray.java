public class StackArray {
    int[] stack = new int[10];
    int top = 0;
    public void push(int value){
        stack[top] = value;
        top++;

    }
    public void display(){
        for(int i : stack){
            System.out.println(i+" ");
        }
    }
    public int pop(){
        int data;
        data = stack[top-1];
        stack[top-1] = 0;
        return data;

    }
}
