package recursion;

public class Substring {

    public static void main(String[]args){
        String str="hello";
        printSunstring(str, 0);
    }

    
    public static void printSunstring(String str,int start){
        if(start==str.length())return;

        StringBuilder sb=new StringBuilder();

        for(int end=start;end<str.length();end++){
            sb.append(str.charAt(end));
            System.out.print(sb+" ");
        }
        printSunstring(str, start+1);

    }
}
