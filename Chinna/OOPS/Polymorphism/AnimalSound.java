package Chinna.OOPS.Polymorphism;

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class dog extends Animal {
    @Override
    void sound() {
        System.out.println("Boww...");
    }
}

class cat extends dog {
    @Override
    void sound() {
        System.out.println("Meow...");
    }
}

public class AnimalSound {
    public static void main(String[] args) {
        Animal an = new Animal();
        dog dg = new dog();
        cat ct = new cat();
        an.sound();
        dg.sound();
        ct.sound();

    }
}
