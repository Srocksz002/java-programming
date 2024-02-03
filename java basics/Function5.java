public class Function5 {

    public static void binToDec(int binNum){
        int myNum=binNum;
        int pow=0;
        int decimal=0;

        while(binNum>0){
            int lastDigit=binNum%10;
            decimal=decimal+(lastDigit*(int)Math.pow(2, pow));
            binNum=binNum/10;
            pow++;
        }
        System.out.println("decimal of binary number "+myNum+"= " +decimal);
    }

    public static void decToBin(int n){
    int decNum=n;
    int pow=0;
    int binNum=0;

    while(decNum>0){
        int rem=decNum%2;
        binNum=binNum+(rem* (int)Math.pow(10, pow));
        decNum=decNum/2;
        pow++;
    }
    System.out.println("binary of "+n +"is "+binNum);
}

    public static void main(String[] args) {
       // binToDec(111);
        decToBin(15);
        
    }
}
