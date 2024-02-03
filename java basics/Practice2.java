public class Practice2 {

    public static int trappingRainwater(int height[]){
        int n=height.length;
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }


        int rightmax[]=new int [n];
        rightmax[n-1]=height[n-1];
        for(int i=n-1;i<=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }

        int trappaedWater=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(rightmax[i],leftmax[i]);
            trappaedWater+=waterlevel-height[i];
        }

        return trappaedWater;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappingRainwater(height));

    }
}
