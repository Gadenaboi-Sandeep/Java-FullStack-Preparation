package Chinna.OOPS.ClassObjects;

public class Car {

    String brand = "BMW";

    void start(){
        System.out.println("Running BMW");
    }
    void stop(){
        System.out.println("Stopping BMW");
    }
    void acclerate(){
        System.out.println("Acclerating BMW");
    }
    public static void main(String[] args) {
        Car s = new Car();
        s.start();
        s.stop();
        s.acclerate();
    }
}
