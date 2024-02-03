import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int n=sc.nextInt();

        if(n==2){
            System.out.println("prime");
        }else{
            boolean isprime = true;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%1==0){
                    isprime=false;
                }
            }
            if(isprime==true){
                System.out.println("n is prime");
            }else{
                System.out.println("n is not prime");
            }
        }
    }
}
