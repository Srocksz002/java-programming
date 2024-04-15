package recursion;

public class Friendspairing {

    public static int friendsPairaing(int n){
        //base case
        if(n==1||n==2){
            return n;
        }

        // //choice 
        // //single
        // int fnm1=friendsPairaing(n-1);

        // //pair
        // int fnm2=friendsPairaing(n-2);
        // int pairways=(n-1)*fnm2;

        // int totWays=pairways+fnm1;
  
        // return totWays;

        return friendsPairaing(n-1)+(n-1)*friendsPairaing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendsPairaing(4));
        
    }
}
