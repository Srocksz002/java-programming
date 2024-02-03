import java.util.*;
public class K {

    //solution1
    public static int average(int a,int b,int c){
        int avg=(a+b+c)/3;
        return avg;
       
    }


    //solution2
    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }


    //solution3
    public static boolean isPalindrome(int num){
        int n=num;
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==num){
            return true;
        }else{
            return false;
        }
    }

    //solution5
    public static int sum(int num){
        int n=num;
        int sum=0;
        while(n>0){
            sum=sum+(n%10);
            n=n/10;
        }
        return sum;
    }


    public static void main(String[] args) {

        //solution1
        //Scanner sc=new Scanner(System.in);
        //System.out.println("enter first number :");
        //int a=sc.nextInt();
        //System.out.println("enter second number :");
        //int b=sc.nextInt();
        //System.out.println("enter third number :");
        //int c=sc.nextInt();
        //int avg=average(a,b,c);
        //System.out.println("avg of "+a+" , "+b+ " ," +c+" is "+avg);


        //solution2
        //Scanner sc=new Scanner(System.in);
        //System.out.println("enter the number :");
        //int n=sc.nextInt();
        //if(isEven(n)){
          //  System.out.println("number is even");
        //}else{
          //  System.out.println("number is odd");
        //}


        //solution3
        //Scanner sc=new Scanner(System.in);
        //System.out.println("enter your number :");
        //int num=sc.nextInt();
        //if(isPalindrome(num)){
          //  System.out.println(num+" is a palindrome");
        //}else{
            //System.out.println(num+" is not a palindrome");
        //}


        //solution5
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr the integer");
        int num=sc.nextInt();
        System.out.println("sum of digits of "+num+" is "+sum(num));



        
    }
}
