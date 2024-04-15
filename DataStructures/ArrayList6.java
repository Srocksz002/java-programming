package DataStructures;
import java.util.ArrayList;

//Container with max water

public class ArrayList6 {
    public static void main(String[] args) {
        ArrayList<Integer>  height=new ArrayList<>();
        //height=[1,8,6,2,5,4,8,3,7]

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        storeWater(height);
    }

    public static void storeWater(ArrayList<Integer>height){
        int maxWater=0;

        //bruteforce------>>O(n^2)

        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int minHeight=Math.min(height.get(i), height.get(j));
                int width=j-i;
                int currWater=minHeight*width;
                maxWater=Math.max(maxWater, currWater);
            }              
        
        }
        System.out.println(maxWater);

        //2 pinter approach------->>>>>O(n)
        // int lp=0;
        // int rp=height.size()-1;

        // while(lp<rp){
        //     int minHeight=Math.min(height.get(lp), height.get(rp));
        //     int width=rp-lp;
        //     int currWater=minHeight*width;
        //     maxWater=Math.max(maxWater, currWater);

        //     if(lp<rp){
        //         lp++;
        //     }else{
        //         rp--;
        //     }

        // }
        // System.out.println(maxWater);
    }
        
}

