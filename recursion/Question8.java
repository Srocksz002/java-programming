package recursion;
public class Question8 {

    public static int merge(int arr[],int left,int mid ,int right){
        int i=left;
        int j=mid;
        int k=0;

        int invCount=0;

        int temp[]=new int[right-left+1];

        while(i<mid && j<=right){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }else{  
                temp[k]=arr[j];
                invCount+=mid-i;
                j++;
                k++;
            }
        }

        while(i<mid){
            temp[k]=arr[i];
            i++;
            k++;
        }  
        
        while(j<=right){
            temp[k]=arr[j];
            j++;
            k++;
        }

        for(i=left,k=0;i<temp.length;i++,k++){
            arr[i]=temp[k];
        }

        return invCount;
    }

    public static int mergeSort(int arr[],int left,int right){
        int invCount=0;

        if(right>left){
    
        int mid=(right+left)/2;

        invCount=mergeSort(arr, left, mid);
        invCount+=mergeSort(arr, mid+1, right);
        invCount+=merge(arr,left,mid+1,right);
        }

        return invCount;

    }  

    // public static int getInversion(int arr[]){
    //     int n=arr.length;
    //     return mergeSort(arr,0,n-1);
    // }
    public static void main(String[] args) {
        int arr[]={1,20,6,4,5};
        int n=arr.length;
        System.out.println(mergeSort(arr,0,n-1));
        //System.out.print(getInversion(arr));
    }

}
