package Chinna.CodeRide;

import java.util.*;

public class Fruit_Details {
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
        Fruit_Details m = new Fruit_Details();
        m.name();
        m.color();
        m.price();
        m.taste();

    }
}
