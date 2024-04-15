package recursion;

public class Tilingproblem {

    public static int tilingProblem(int n){//2*n  floor size

        //base case
        if(n==0 || n==1){
            return 1;
        }

        //kaam
        //vertical
        int wnm1=tilingProblem(n-1);

        //horizontal
        int wnm2=tilingProblem(n-2);

        int totWays=wnm1+wnm2;

        return totWays;
    }
      
    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
        
    }
}
