public class practice {

    public static void bubbleSort(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]<arr[j]){
                    minpos=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minpos];
            arr[minpos]=temp;
        }
    }

    public static void insertionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }

    public static void countingSort(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }

        int count[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]<0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        //bubbleSort(arr);
        //selectionSort(arr);
        //insertionSort(arr);
        countingSort(arr);

        print(arr);
    }
}
