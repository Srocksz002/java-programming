import java.util.*;
public class question4 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the price of pencil");
        float pencil = sc.nextFloat();
        System.out.println("enter the price of pen");
        float pen = sc.nextFloat();
        System.out.println("enter the price of an eraser");
        float eraser = sc.nextFloat();
        float bill = pencil+pen+eraser;
        System.out.println("the bill is: " + bill);
        float advbill = bill + (bill*(18/100));
        System.out.println("bill including gst is : " + advbill);
    }
}