package Oops;

public class Constructor {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name="Shreya";
        s1.roll=123;
        s1.password="abcdefgh";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        
        
        
        //Student s2=new Student("Shreya");
        //Student s3=new Student(123);
        //System.out.println(s1.name);

        Student s2=new Student(s1);
        s1.marks[2]=100;
        s2.password="jkhg";
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
        
    }
}

class Student{                   
    String name;
    int roll;
    String password;
    int marks[];

    /*Student(Student s1){                     //shallow Copy constructor
        this.name=s1.name;
        this.roll=s1.roll;
        marks=new int[3];
        this.marks=s1.marks;

    }*/

    Student(Student s1){                       //deep copy constructor
        this.name=s1.name;
        this.roll=s1.roll;
        marks=new int[3];
        for(int i=0;i<3;i++){
            this.marks[i]=s1.marks[i];
        }

    }


    Student(){                               //non parameterized constructor
        System.out.println("contructor is called...");
        marks = new int[3];
    }

    Student(String name){                    //parameterized constructor
        this.name=name;
        marks =new int[3];
    }

    Student(int roll){
        this.roll=roll;
        marks =new int[3];
    }
}
