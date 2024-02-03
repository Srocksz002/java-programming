import java.util.*;
public class B{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
        if (age<13){
            System.out.println("child");
        }else if(age>=13&&age<18){
            System.out.println("teenager");
        }else{
            System.out.println("adult"
            );
        }

    }
}