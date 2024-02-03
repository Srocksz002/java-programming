public class Array9 {

    public static void maxSubarray(int numbers[]){
        int currsum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                 currsum=0;
                for(int k=i;k<=j;k++){
                    currsum+=numbers[k];

                }
                System.out.println("sum:"+currsum);
                if(maxSum<currsum){
                    maxSum=currsum;
                }
            }
            System.out.println();
        }
        System.out.println("maxsum is "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        maxSubarray(numbers);
    }
}
