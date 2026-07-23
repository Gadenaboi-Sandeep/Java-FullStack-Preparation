package Chinna.OOPS.Polymorphism;

public class CalculatorOverloading {
    int add(int a, int b){
        return a*b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add(double a, double b){
        return a/b;
    }
    public static void main(String[] args) {
        CalculatorOverloading co = new CalculatorOverloading();
        System.out.println(co.add(2, 04));
        System.out.println(co.add(174, 32.5));
        System.out.println(co.add(2,4,6));
    }
}
