package DataStructures;
import java.util.ArrayList;
public class MonotonicArrayList {

    public static Boolean isMonotonic(ArrayList<Integer>list){
        int n=list.size();
        Boolean inc=true;
        Boolean dec=true;
        for(int i=0;i<n-1;i++){
            if(list.get(i)>list.get(i+1)){
                inc=false;
            }else{
                dec=false;
            }
        }
        return inc||dec;
    }    
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        System.out.println(isMonotonic(list));
    }
}
