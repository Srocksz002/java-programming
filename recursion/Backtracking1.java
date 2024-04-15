package recursion;

public class Backtracking1 {

    public static void changeArr(int arr[],int i,int v){

        //base case
        if(i==arr.length){
            printArr(arr);
            return;
        }

        //recursion
        arr[i]=v;
        changeArr(arr, i+1, v+1); //funx call step
        arr[i]=arr[i]-2; //backtracking step
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        int arr[]=new int[5];
        changeArr(arr,0,1);
        printArr(arr);
    }
}
