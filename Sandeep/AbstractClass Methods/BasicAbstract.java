abstract class A{
    void show(){

    };
}
class B extends A{

    
    void show() {
       System.out.println("Hello In B Show");
    }
    
}

public class BasicAbstract {
    public static void main(String[] a) {
        B obj=new B();
        obj.show();
    }
}
