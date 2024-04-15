package recursion;

// N QUEENS PROBLEM

public class Practice {
    public static void main (String args[]){
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
            //System.out.println();
        }
        nQueens(board,0);
    }

    public static void nQueens(char board[][],int row){
        if(row==board.length){
            //System.out.println("----------chess board-------------");
            printBoard(board);
            return;
        }

        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueens(board, row+1);
                board[row][j]='X';
            }
           // board[row][j]='X';
        }
    }

    public static void printBoard(char board[][]){
        System.out.println("----------chess board-------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        return;

    }

    public static boolean isSafe(char board[][],int row,int col){
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }
}