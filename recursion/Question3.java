package recursion;

public class Question3 {
    public static void main(String[] args) {
        String strrr ="shreya";
        int length=length(strrr);
        System.out.println(length);
        
    }

    public static int length(String str){
        if(str.length()==0){
            return 0;
        }
        return length(str.substring(1))+1;
    }
}
