package DataStructures;
import java.util.ArrayList;
public class ArrayList7 {

    //brute force
    // public static boolean pairSum(ArrayList<Integer>list,int target){
    //     int n=list.size();
    //     for(int i=0;i<list.size();i++){
    //         for(int j=i+1;j<list.size();j++){
    //             if(target==list.get(i)+list.get(j)){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }


    //2pointer approach
    public static boolean pairSum(ArrayList<Integer>list,int target){
        int n=list.size();
        int lp=0;
        int rp=n-1;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }else if(list.get(lp)+list.get(rp)<target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);list.add(6);
        int target=5;
        System.out.println(pairSum(list,target));
    }
}
