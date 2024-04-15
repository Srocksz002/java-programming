package recursion;

public class Question7 {

    public static int majorityElement(int arr[]){
        int winner=arr[0];
        int lead=1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]==winner){
                lead++;
            }
            else if(lead>0){

                lead--;

            }else{
                winner=arr[i];
                lead=1;
            }
        }
        return winner;
    }
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
    
}
