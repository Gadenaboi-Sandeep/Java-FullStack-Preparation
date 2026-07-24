package Chinna.CodeRide;

public class SwapTwoVar {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp = 0;
        System.out.println("Before Swapping");
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        temp = a+b;
        a = temp-a;
        b = temp-b;
        System.out.println("After swapping");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
