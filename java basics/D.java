import java.util.*;
public class D {
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter A");
        int A = sc.nextInt();
        System.out.println("enter B");
        int B = sc.nextInt();
        System.out.println("enter C");
        int C = sc.nextInt();
         if(A>=B && A>=C){
           System.out.println("A is largest"); 
         }else if(B>C){
            System.out.println("B is largest");
         }else{
            System.out.println("C is largest");
         }
         
    }
    
}
