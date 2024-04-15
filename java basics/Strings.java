import java.util.*;

public class Strings {

    public static void printLetters(String fullName){
        for(int i=0;i<fullName.length();i++){
            System.out.print(fullName.charAt(i)+" ");
        }
        System.out.println();
    }

    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //String str="abc";
       // String str1=new String("xyz");

        //Scanner sc=new Scanner(System.in);
        //String name=sc.next();
        //String name=sc.nextLine();
        //System.out.println(name);

        //String fullname="Shreya Pal";
        //System.out.println(fullname.length());

        //concatenation
        String firstName="Shreya";
        String lastName="Pal";
        String fullName=firstName+" "+lastName;
        //System.out.println(fullName.charAt(0));
        //printLetters(fullName);
        String str="racecar";
        int length=str.length()/2;
        //System.out.println(length);
        //System.out.println(isPalindrome(str));

        String S1="Tony";
        String S2="Tony";
        String S3=new String("Tony");

        //if(S1==S2){
            //System.out.println("strings are equal");
        //}
        //else{
            //System.out.println("strings are not equal");
        //}
        
        
        //if(S1==S3){
            //System.out.println("strings are equal");
        //}else{
            //System.out.println("Strings are not equal");
        //}

        if(S1.equals(S3)){
            System.out.println("strings are equal");
        }else{
            System.out.println("strings are not equal");
        }
    }
}
