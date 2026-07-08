class Calculator{

    
    public int add(int a,int b){
        return a+b;
    }
}

public class Demo {
    public static void main(String[] args) {
        Calculator obj=new Calculator();
        int a=10;
        int b=20;
        System.out.println(obj.add(a, b));
    }
}
