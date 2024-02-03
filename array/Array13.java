public class Array13 {

    public static void kadane(int numbers[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            cs=cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(ms, cs);
        }
        System.out.println("max sum is "+ms);
    }
    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        kadane(numbers);

    }
}
