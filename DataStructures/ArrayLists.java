
package DataStructures;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {

        //defining an arraylist
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Boolean> List3=new ArrayList<>();


        //operations 

        //add element
        list1.add(1);   //O(1)
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);


        list1.add(5,6);  //O(n)

        System.out.println(list1);


        //get element
        int element=list1.get(2);
        // System.out.println(element);
        // System.out.println(list1.get(1));

        //remove element
        // list1.remove(2);
        // System.out.println(list1);

        //set element at index
        list1.set(2,8);
        //System.out.println(list1);

        //contains element
       System.out.println(list1.contains(16));
       System.out.println(list1.contains(8));
    }
}
