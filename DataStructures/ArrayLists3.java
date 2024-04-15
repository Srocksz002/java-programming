package DataStructures;
import java.util.ArrayList;
public class ArrayLists3 {

    public static void Swap(ArrayList<Integer>list,int idx1,int idx2){

        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<Integer>();

        list.add(4);
        list.add(6);
        list.add(7);
        list.add(2);
        list.add(1);

        System.out.println(list);

        int idx1=3,idx2=0;
        Swap(list,idx1,idx2);

        System.out.println(list);

    }
}
