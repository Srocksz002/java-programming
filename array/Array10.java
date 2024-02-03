public class Array10 {
    public static void printSubarray(int numbers[]){

        int currsum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                currsum=0;
                for(int k=i;k<=j;k++){
                    currsum+=numbers[k];
                    
                }
                System.out.println("sum:"+currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
                
            }
        }
        System.out.println("max sum is = "+maxsum);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printSubarray(numbers);
    }
}
