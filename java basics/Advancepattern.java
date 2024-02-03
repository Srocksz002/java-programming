public class Advancepattern {

    public static void hollowRectangle(int totRow,int totColoumn){
        for(int i=1;i<=totRow;i++){
            for(int j=1;j<=totColoumn;j++){
                if(i==1||i==totRow||j==1||j==totColoumn){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            
        }
    }


    public static void invertedRotatedHalfPyramid(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void invertedHalfPyramidWithNumbers(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }


    public static void floydsTriangle(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }


    public static void zeroOneTriangle(int n ){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

     public static void butterflyPattern(int n){
        for(int i=1;i<=n;i++){
            //stars-i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces-2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars-i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
             //stars-i
             for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces-2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars-i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
     }

     public static void solid_rhombus(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
     }


     public static void hollow_rhombus(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
     }


     public static void diamond(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
     }
    public static void main(String[] args) {
        //hollowRectangle(7,10 );
        //invertedRotatedHalfPyramid(7);
        //invertedHalfPyramidWithNumbers(5);
        //floydsTriangle(5);
        //zeroOneTriangle(5);
        //butterflyPattern(7);
        //solid_rhombus(5);
        //hollow_rhombus(5);
        diamond(5);
    }
}
