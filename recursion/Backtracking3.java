package recursion;

public class Backtracking3 {

    public static void findPermutations(String str,String ans){

        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            findPermutations(newstr, ans+currChar);

        }
    }
    public static void main(String[] args) {
        findPermutations("Dev", "");
        
    }
    
}
