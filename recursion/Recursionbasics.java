package recursion;

public class Recursionbasics {
    public static void main(String[] args) {
        //int n=5;
       // printDec(n);
       //printInc(n);
       //System.out.println(fact(n));
       //System.out.println(calcSum(n));
       //System.out.println(fib(25));

       //int arr[]={8,6,4,6,7,5,6,8,3,5};
       //System.out.println(lastOccurence(arr,5,0));
       System.out.println(optimizedPower(2, 5));

    }

    public static void printDec(int n){
        if (n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);

    }

    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1=fact(n-1);
        int fn=n*fnm1;
        return fn;
    }

    public static int calcSum(int n){
        if(n==1){
            return 1;
        }
        int Snm1=calcSum(n-1);
        int sum=n+Snm1;
        return sum;
    }

    public static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        int fibnm1=fib(n-1);
        int fibnm2=fib(n-2);
        int fibn=fibnm1+fibnm2;
        return fibn;
    } 
    
    public static Boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }

    public static int firstOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==arr[key]){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }


    public static int lastOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isfound=lastOccurence(arr, key, i+1);
        if(isfound==-1 && arr[i]==arr[key]){
            return i;
        }
        return isfound;
    }

    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        // int xnm1=power(x, n-1);
        // int xn=x*xnm1;
        // return xn;

        return x*power(x, n-1);
    }

    public static int optimizedPower(int x,int n){
       
        if(n==0){
            return 1;
        }

        int halfpower=optimizedPower(x, n/2);
        int sqhalfpower=halfpower*halfpower;

        //n is odd
        if(n%2!=0){
            sqhalfpower=x*sqhalfpower;
        }

        return sqhalfpower;
    }
}
