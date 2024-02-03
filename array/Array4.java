import java.util.*;
//largest number in array
public class Array4 {

    public static int getLargest(int numbers[]){
        int largest=Integer.MIN_VALUE;// -infinity
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
            if(numbers[i]<smallest){
                smallest=numbers[i];
            }
        }
        System.out.println("smallest number is "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={1,3,6,5,2,0};
        System.out.println("largest number is "+getLargest(numbers));


    }
}
