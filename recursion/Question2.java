package recursion;
public class Question2 {
    public static void main(String[] args) {
        printDigits(764873);
    } 

    public static void printDigits(int number){
        String Digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        //base case
        if(number==0){
            return;
        }

        int lastDigit=number%10;
        printDigits(number/10);
        System.out.print(Digits[lastDigit]+" ");
    }
}
