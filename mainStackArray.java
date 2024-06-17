public class mainStackArray {
    public static void main(String[] args) {
        StackArray s1 = new StackArray();
        s1.push(5);
        s1.push(6);
        s1.push(7);

        System.out.println(s1.pop());
        s1.display();
    }
}
