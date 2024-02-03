public class Array2{
    public static void update(int marks[],int unchangeable){
         unchangeable=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }

    }
    public static void main(String args[]){
        int marks[]={97,98,99};
        int unchangeable=5;//its value doesnot changed becausse its a variable and variables are padsed by value
        update(marks,unchangeable);
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        System.out.println(unchangeable);

        //aarays are passed by reference in a function while variables are passed by value
    }
}