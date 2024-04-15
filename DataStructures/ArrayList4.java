package DataStructures;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(3);
        list.add(1);

        Collections.sort(list);      //sort in ascending order
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());    //sort in descending order
        System.out.println(list);
    }
}
