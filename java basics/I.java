import java.util.*;
public class I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evensum=0;
        int oddsum=0;

        for(int i=1;n>0;i++){
            int lastdigit=n%10;
            if(lastdigit%2==0){
                evensum=evensum+lastdigit;

            }else{
                oddsum=oddsum+lastdigit;
            }
            n=n/10;
        }
        System.out.println("sum of even digits is : " +evensum);
        System.out.println("sum of odd digits is : " +oddsum);
    }
}
