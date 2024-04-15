package DataStructures;
import java.util.ArrayList;
import java.util.Scanner;
public class Question3 {

    public static int mostFrequency(ArrayList<Integer>nums,int k){
        int count []=new int[1001];
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i)==k){
                count[nums.get(i+1)]++;
            }
        }

        int maxValue=0;
        int target=0;

        for(int i=0;i<count.length;i++){
            if(count[i]>maxValue){
                target=i;
                maxValue=count[i];
            }
        }
        return target;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        int k=sc.nextInt();
        int n=sc.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            arr.add(num);
        }
        int ans=mostFrequency(arr,k);
        System.out.println(ans);

    }
}
