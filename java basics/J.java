import java.util.*;
public class J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evensum=0;
        int oddsum=0;

        for(int i=1;true;i++){
            System.out.print("enter integer : ");
            int n = sc.nextInt();
            if(n%2==0){
                evensum=evensum+n;
            }else{
                oddsum=oddsum+n;
            }
        }  
        
    }
}
