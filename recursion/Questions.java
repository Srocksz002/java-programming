package recursion;

public class Questions {

    public static void indices(int n,int arr[],int key){
        //base case
        if(n==0){
            return;
        }

        if(arr[arr.length-n]==key){
            System.out.println(arr.length-n);
        }

        indices(n-1, arr, key);
    } 
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        indices(9, arr, 2);
        
    }
    
}
