package Sandeep;

class A{
    A(){
        System.out.println("in A");
    }
    A(int a){
        System.out.println("in INT A");
    }
}
class B extends A{
    B(){
        
        System.out.println("in B");
    }

    B(int a){
        super(10);
        System.out.println("in INT B");
    }
}

public class Demo{
    public static void main(String[] args) {
        B obj = new B();
    }
}
