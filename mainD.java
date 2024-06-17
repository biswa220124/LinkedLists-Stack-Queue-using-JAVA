public class mainD {
    public static void main(String[] args) {
        doublelinklists newDouble = new doublelinklists(5);
        /*newDouble.getHead();
        newDouble.getTail();
        newDouble.getLength();
        newDouble.printlist();*/
        newDouble.prepend(50);
        newDouble.prepend(60);
        newDouble.prepend(48);
        newDouble.remove(2);
        newDouble.printlist();



    }
}
