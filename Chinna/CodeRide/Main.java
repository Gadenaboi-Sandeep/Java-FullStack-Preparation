package Chinna.CodeRide;

import java.util.*;

public class Main {
    Scanner sc = new Scanner(System.in);
    public void name(){
            System.out.println("Fruit Details:");
            String name = sc.nextLine();
            System.out.println("Name : "+name);
        }

        public void color(){
            String color = sc.nextLine();
            System.out.println("Color : "+color);
        }

        public void price(){
            double price = sc.nextDouble();
            System.out.println("Price : "+price+" per kg");
        }

        public void taste(){
            String taste = sc.nextLine();
            System.out.println("Taste : "+taste);
        }
            
    public static void main(String[] args) {
        Main m = new Main();
        m.name();
        m.color();
        m.price();
        m.taste();

    }
}
