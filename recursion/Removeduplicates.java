package recursion;

public class Removeduplicates {

    public static void removeDuplicates(String str,int idx,StringBuilder newstr,boolean map[]){
        //base case
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }

        //kaam
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            removeDuplicates(str, idx+1, newstr, map);
        }else{
            map[currchar-'a']=true;
            removeDuplicates(str, idx+1, newstr.append(currchar), map);
        }
    }

    public static void main(String[] args) {
        String str ="appnnacollege";
        StringBuilder newstr = new StringBuilder("");
        removeDuplicates(str, 0, newstr, new boolean [26]); 
        
    }
}
