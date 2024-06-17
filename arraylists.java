import java.util.ArrayList;
import java.util.Collections;

public class arraylists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>(5);
        //add element
        list1.add(0);
        list1.add(1);
        list1.add(2);

        System.out.println(list1);

        //get elements
        int element = list1.get(1);
        System.out.println(element);

        //set elements
        list1.set(1,9);
        System.out.println(list1);

        //add elemnts in between
        list1.add(1,8);
        System.out.println(list1);

        //delete/remove element
        list1.remove(3);
        System.out.println(list1);

        //count elements or size
        int size = list1.size();
        System.out.println(size);

        //loops
        for(int i=0; i< list1.size();i++){
            System.out.println(list1.get(i));
        }
        //Sorting
        Collections.sort(list1);
        System.out.println(list1);


    }
}
