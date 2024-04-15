package recursion;

public class Question10 {

    public static void knight(int matrix[][],int n,int i,int j,int move){
        if(i<0 || j<0 || i>=n || j>=n){
            return;
        }

        if(matrix[i][j]!=0){
            return;
        }
        matrix[i][j]=move;

        if(move==(n*n)-1){
            
            printMatrix(matrix);
            return;
        }


        knight(matrix, n, i-2, j+1, move+1);//up right1
        //knight(matrix, n, i-2, j-1, move+1);//up left
        knight(matrix, n, i+2, j+1, move+1);//down right 
        knight(matrix, n, i-2, j-1, move+1);//up left
        knight(matrix, n, i+2, j-1, move+1);//down left
        knight(matrix, n, i-1, j+2, move+1);//right up
        knight(matrix, n, i+1, j+2, move+1);//right down
        knight(matrix, n, i-1, j-2, move+1);//left up
        knight(matrix, n, i+1, j-2, move+1);//left down

        matrix[i][j]=0;

    }

    public static void printMatrix(int matrix[][]){
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        return;
    }

    public static void main(String[] args) {
        int n=8;
        int matrix[][]=new int[n][n];
        knight(matrix,n,0,0,0);
    }
}