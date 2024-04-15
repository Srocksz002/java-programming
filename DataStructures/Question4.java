package DataStructures;
import java.util.ArrayList;
import java.util.Scanner;

public class Question4 {

    public static ArrayList<Integer> beautifulArray(int n){
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(1);

        while(ans.size()<n){
            ArrayList<Integer>temp=new ArrayList<>();
            int ans_size=ans.size();
            for(int i=0;i<ans_size;i++){
                if((ans.get(i)*2-1)<=n){
                    temp.add(ans.get(i)*2-1);
                }
            }
            for(int i=0;i<ans_size;i++){
                if(ans.get(i)*2<=n){
                    temp.add(ans.get(i)*2);
                }
            }
            ans=temp;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>ans = beautifulArray(n);
        System.out.println(ans);

        // int ans_size=ans.size();
        // for(int i=0;i<ans_size;i++){
        //     System.out.print(ans.get(i)+" ");
        // }


    }
}
