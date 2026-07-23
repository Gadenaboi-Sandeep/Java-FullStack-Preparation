package Chinna.OOPS.Polymorphism;

public class DisplayOverload {
    void display(String name){
        System.out.println("Name: "+name);
    }
    void display(int age){
        System.out.println("Age: "+age);
    }
    void display(double cgpa){
            System.out.println("CGPA: "+cgpa);
    }
    public static void main(String[] args) {
        DisplayOverload d = new DisplayOverload();
        d.display("Chinna");
        d.display(21);
        d.display(8.11);

    }
}
