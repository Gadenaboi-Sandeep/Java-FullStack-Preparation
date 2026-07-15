package Chinna.Methods;

public class MathsCalculations {

    static int square(int a){
        return a^2;
    }
    static int cube(int a){
        return a*a*a;
    }
    static int circle(){
        return 0;
    }
    static int rectangle(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        System.out.println("Area of Square: "+square(5));
        System.out.println("Area of Cube: "+cube(3));
        System.out.println("Area of Circle: "+circle());
        System.out.println("Area of Rectangle: "+rectangle(4, 6));
    }
}
