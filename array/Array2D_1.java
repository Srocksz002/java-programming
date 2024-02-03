public class Array2D_1 {

    public static void printSpiral(int matrix[][]){
        int startRow=0;
        int endRow=matrix.length-1;
        int startCol=0;
        int endCol=matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }

            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }

            //bottom
            for(int j=endCol-1 ;j>=startCol;j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }

            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        System.out.println();
    }


    public static int diagnolSum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i]; 
            if( i!= matrix.length-i-1){
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }


    public static boolean stairCaseSearch(int matrix[][],int key){
        int row=0;
        int col=matrix.length-1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col] == key){
                System.out.print("found at ("+row+","+col+")");
                return true;
            }

            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("not found");
        return false;

    }

    public static boolean staircaseSearch(int matrix[][],int key){
        int row=matrix.length-1,col=0;
        while(row>=0 && col<matrix[0].length){
            if(matrix[row][col]==key){
                System.out.println("found at ("+row+","+col+")");
                return true;
            }
            else if(key < matrix[row][col]){
                row--;
            }else{
                col++;
            }
        }
        System.out.println("not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
       // printSpiral(matrix);
       //System.out.println(diagnolSum(matrix));
       int key=30;
       //stairCaseSearch(matrix, key);
       staircaseSearch(matrix, key);
       
    }
}
