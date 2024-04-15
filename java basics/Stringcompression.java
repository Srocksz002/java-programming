public class Stringcompression {
    public static String compress(String str){
        StringBuilder newstr = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=1;
            //newstr.append(str.charAt(i));
            while((i<str.length()-1) && (str.charAt(i)==str.charAt(i+1))){
                count++;
                i++;
            }
            newstr.append(str.charAt(i));
            //count.toString();
            if(count>1){
                count.toString();
                newstr.append(count);
            }
        }
        return newstr.toString();
    }
    public static void main(String[]args){
        String str = "aaabbcccdd";
        System.out.println(compress(str));



    }
}
