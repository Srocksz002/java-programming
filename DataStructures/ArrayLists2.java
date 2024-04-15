package DataStructures;
import java.util.ArrayList;

public class ArrayLists2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(4);
        list.add(8);
        list.add(16);
        list.add(2);
        list.add(3);

        System.out.println(list.size());

        //print arraylist
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //print reverse arraylist
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //find max ----------------->>>>>>>>>>>>>O(n)
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            // if(max<list.get(i)){
            //     max=list.get(i);
            // }
            max=Math.max(max, list.get(i));
        }
        System.out.println(max);
    }
    
}
