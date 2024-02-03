public class Array2d_assignment {

    public static void seven(int matrix[][]){
        int count=0;
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[0].length;col++){
                if(matrix[row][col]==8){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void sum(int nums[][]){
        int row=nums.length;
        int col=nums[0].length;

        for(row=0;row<nums.length;row++){
            for(col=0;col<nums[0].length;col++){
                if(row==1){
                    System.out.print(nums[row][col]+",");
                }
            }
        }
    }


    public static void transpose(int array[][]){
        for(int col=0;col<array[0].length;col++){
            for(int row=0;row<array.length;row++){
                System.out.print(array[row][col]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int matrix[][]={{4,7,8},
                        {8,8,7}};
        int nums[][]={{1,4,9},
                      {11,4,3},
                      {2,2,3}};
        int array[][]={{11,12,13},
                       {21,22,23}};
        //seven(matrix);
        //sum(nums);
        transpose(array);
    }
}
