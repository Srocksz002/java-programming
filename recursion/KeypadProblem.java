package recursion;
public class KeypadProblem {

    final static char keypad[][]={{},
    {},
    {'a','b','c'},
    {'d','e','f'},
    {'g','h','i'},
    {'j','k','l'},
    {'m','n','o'},
    {'p','q','r','s'},
    {'t','u','v'},
    {'w','x','y','z'}};
    public static void main(String[] args) {
        lettersCombination("23");
    }

    public static void lettersCombination(String givenString){
        int len = givenString.length();
        if(len==0){
            System.out.println(" ");
            return;
        }
        recursive_fun(0,len,givenString," ");
        
    }

    public static void recursive_fun(int pos,int len,String givenString,String outpuString){
        if(pos==len){
            System.out.println(outpuString);
        }else{
            char alphabets[]=keypad[givenString.charAt(pos)-'0'];
            for(int i=0;i<alphabets.length;i++){
                recursive_fun(pos+1, len, givenString, outpuString+alphabets[i]);
            }
        }
    }
}

