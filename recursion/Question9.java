package recursion;

public class Question9 {
    public static void main(String[]args){
        int matrix[][]={{1,1,1,1},{0,1,0,1},{1,1,1,1},{1,0,1,1}};
        int n=matrix.length;
        boolean visited[][]=new boolean[n][n];
        findPath(matrix, 0, 0, n, visited,"");

    }

    public static void findPath(int matrix[][],int i,int j,int n,boolean visited[][],String psf){
        if(i<0 || j<0 || i>=n || j>=n){
            return ;
        }

        if(matrix[i][j]==0 || visited[i][j]==true){
            return ;
        }

        if(i==n-1 && j==n-1){
            System.out.println("reached aour destination");
            System.out.println(psf);
        }

        visited[i][j]=true;

        findPath(matrix, i-1, j, n, visited, psf+"U");//up
        findPath(matrix, i+1, j, n, visited,psf+"D");//down
        findPath(matrix, i, j-1, n, visited,psf+"L");//left
        findPath(matrix, i, j+1, n, visited,psf+"R");//right

        visited[i][j]=false;

    }
}
