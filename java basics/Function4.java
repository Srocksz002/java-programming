public class Function4 {

    public static int sum(int a,int b){
        return a+b;
    }

    public static float sum(float a,float b){
        return a+b;
    }

   // public static boolean isPrime(int n){

        //corner cases
        //if(n==2){
       //     return true;
       // }
        //boolean isPrime=true;
       // for(int i=2;i<=n-1;i++){
       //     if (n%i==0) {
                //isPrime=false;
                //break;
        //        return false;
        //    }
        //}
       // return true;
    //}


    public static boolean isPrime(int n){

        if (n==2){
            return true;
        }
        for(int i =2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    
    public static void primeInRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
        System.out.println();
        
    }
    public static void main(String args[]) {
        //System.out.println(sum(5, 3));
        //System.out.println(sum(3.2f,4.8f));
        //System.out.println(isPrime(100));
        primeInRange(20);
        
    }
}
