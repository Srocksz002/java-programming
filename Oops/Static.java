package Oops;

public class Static {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.schoolName="CCJD";

        // Student s2=new Student();
        // System.out.println(s2.schoolName); 

        Student s3=new Student();
        s3.schoolName="KV";

        Student s2=new Student();
        System.out.println(s2.schoolName); 
        
    }
}
class Student{
    String name;
    int rollno;

    static String schoolName;

    void setname(){
        this.name=name;
    }

    void getname(String name){
        System.out.println("name");
    }

    static int returnPercentage(int phy ,int chem,int maths){
        return (phy+chem+maths)/3;
    }
}