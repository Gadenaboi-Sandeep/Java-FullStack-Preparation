package Chinna.Methods;

public class Calculator {
    static int add(int a, int b){
        return a+b;
    }
    static int sub(int a,int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }
    static int div(int a, int b){
        return a/b;
    }
    public static void main(String[] args) {
        System.out.println("Addition: "+add(22,4));
        System.out.println("Subtraction: "+sub(22,4));
        System.out.println("Multiplication: "+mul(22,4));
        System.out.println("Division: "+div(22,4));
    }
}
