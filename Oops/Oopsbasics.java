package Oops;

public class Oopsbasics {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("BLUE");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        //p1.setColor("yellow");
        p1.setColor("yellow");
        System.out.println(p1.getColor());

       /*  BankAccount acc1 = new BankAccount();
        acc1.username="Shreya";
        //acc1.password="abcdefgh"
        acc1.setPassword("abcdefgh");
        //System.out.println(acc1.password);*/

    }
}
class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }
        
    void setColor(String newcolor){
        this.color=newcolor;
    }
    void setTip(int newTip){
        this.tip=newTip;
    }
}
/* 
class BankAccount{
    public String username;
    private String password;

    public void setPassword( String newpassword){
        password=newpassword;

    }
}*/
    
 
