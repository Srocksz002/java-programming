package DataStructures;
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Scanner;
import java.util.*;
public class LonelyNumber {

    public static ArrayList<Integer> findLonely(ArrayList<Integer>list){
        int n=list.size();
        Collections.sort(list);
        ArrayList<Integer>result=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i!=0 && ((list.get(i-1)==list.get(i)-1) || list.get(i-1)==list.get(i))){
                continue;
            }
            if(i<n-1 && ((list.get(i+1)==list.get(i)+1) || list.get(i+1)==list.get(i))){
                continue;
            }
            result.add(list.get(i));
        }
        return result;
        
    }
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            arr.add(num);
        }
        ArrayList<Integer>ans=findLonely(arr);
        System.out.println(ans);
        
    }
}
