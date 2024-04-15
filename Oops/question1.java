package Oops;
public class question1 {
    public static void main(String[] args) {
        Complex c1=new Complex(5, 6);
        Complex c2=new Complex(7, 8);
        c1.printcomplex();
        c2.printcomplex();
        Complex result=c1.add(c2);
        Complex result2=c1.sub(c2);
        Complex result3=c1.prod(c2);
        result.printcomplex();
        result2.printcomplex();
        result3.printcomplex();
        
    }
}

class Complex{
    int real;
    int img;

    Complex(int r,int i){
        this.real=r;
        this.img=i;
    }

    public void printcomplex(){
        if(this.img!=0){
            System.out.println(this.real+" + "+this.img+"i");
        }else{
            System.out.println(this.real);
        }
    }

    public Complex add(Complex c){
        Complex result=new Complex(0,0);
        result.real=this.real+c.real;
        result.img=this.img+c.img;
        return result;
    }

    public Complex sub(Complex c){
        Complex result=new Complex(0,0);
        result.real=this.real-c.real;
        result.img=this.img-c.img;
        return result;
    }

    public Complex prod(Complex c){
        Complex result=new Complex(0,0);
        result.real=this.real*c.real;
        result.img=this.img*c.img;
        return result;
    }
}
