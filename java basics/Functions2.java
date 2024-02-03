public class Functions2 {

    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a is : " +a);
        System.out.println("b is : " +b);

    }

    public static int multiply(int a,int b){
        int product = a*b;
        return product;
    } 

    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }

    public static int binCoeff(int n,int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nmr_fact=factorial(n-r);

        int bincoeff=n_fact/(r_fact*nmr_fact);
        
        return bincoeff;
    }
    public static void main(String args[]) {
        int a=5;
        int b=10;
        //swap(a,b);

        //int prod=multiply(a, b);
        //System.out.println("a*b = "+prod);

        //prod=multiply(4, 2);
        //System.out.println("a*b = "+prod);

        //System.out.println(factorial(4));

        System.out.println(binCoeff(4, 2));
        
    }
}
