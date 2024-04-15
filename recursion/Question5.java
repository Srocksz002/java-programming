package recursion;

public class Question5 {
    public static void towerOfHanoi(int n,String source,String helper,String Dest ){
        if(n==1){
            System.out.println("transfer "+n+" disk from "+source+" to "+Dest);
            return;

        }
        towerOfHanoi(n-1, source, Dest, helper);
        System.out.println("transfer "+n+" disk from "+source+" to "+Dest);
        towerOfHanoi(n-1, helper, source, Dest);
    }
    public static void main(String[] args) {
        towerOfHanoi(3, "s","h","d");
        
    }
}
