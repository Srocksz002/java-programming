public class Array_assignment1 {

    public static boolean check(int num[]){
        int n=num.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(num[i]==num[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int num[]={1,2,3,6};
        System.out.println(check(num));
    }
}
