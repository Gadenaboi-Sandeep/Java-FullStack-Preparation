package Chinna.Day3;
import java.util.*;

public class FoodOdering {
    public void Pizza(){
        System.out.println("Pizza: 299");
    }
    public void Burger(){
        System.out.println("Buger: 159");
    }
    public void Dosa(){
        System.out.println("Dosa: 49");
    }
    public void Biryani(){
        System.out.println("Biryani: 259");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Main menu: \n1. Pizza \n2. Burger \n3. Dosa \n4. Biryani");
        System.out.print("Enter menu number: ");
        int menu = sc.nextInt();
        FoodOdering obj = new FoodOdering();
        switch(menu){
            case 1:
            obj.Pizza();
            break;
            case 2:
            obj.Burger();
            break;
            case 3:
            obj.Dosa();
            break;
            case 4:
            obj.Biryani();
            break;
            case 5:
                break;
                default:
                System.out.println("Invalid Input");
        }
        sc.close();
    }
}
