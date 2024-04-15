package recursion;
public class Backtracking7 {
    public static void main(String[] args) {
        int sudoku[][]={{0,0,8,0,0,0,0,0,0},
        {4,9,0,1,5,7,0,0,2},
        {0,0,3,0,0,4,1,9,0},
        {1,8,5,0,6,0,0,2,0},
        {0,0,0,0,2,0,0,6,0},
        {9,6,0,4,0,5,3,0,0},
        {0,3,0,0,7,2,0,0,4},
        {0,4,9,0,3,0,0,5,7},
        {8,2,7,0,0,9,0,1,3}};

        if(sudokuSolver(sudoku,0,0)){
            System.out.println("solution exists");
            printSudoku(sudoku);
        }else{
            System.out.println("solution does not exists");
        }
    }

    public static boolean sudokuSolver(int sudoku[][],int row,int col){
        //base case
        if(row==9){
            return true;
        }


        //recursion 
        int nextRow=row,nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }

        if(sudoku[row][col]!=0){
            return sudokuSolver(sudoku, nextRow, nextCol);
        }
        for(int digits=1;digits<=9;digits++){
            if(isSafe(sudoku,row,col,digits)){
                sudoku[row][col]=digits;
                if(sudokuSolver(sudoku, nextRow, nextCol)){
                    return true;
                }
                sudoku[row][col]=0;

            }
        }

        return false;
    }

    public static boolean isSafe(int sudoku[][],int row,int col,int digits){
        //row
        for(int j=0;j<=8;j++){
            if(sudoku[row][j]==digits){
                return false;
            }
        }

        //col
        for(int i=0;i<=8;i++){
            if(sudoku[i][col]==digits){
                return false;
            }
        }

        //grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;

        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudoku[i][j]==digits){
                    return false;
                }
            }
        }

        return true;
    }

    public static void printSudoku(int sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }

    
}
