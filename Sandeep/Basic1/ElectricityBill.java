package Sandeep.Basic1;
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Units:");
        int units = sc.nextInt();
        int bill = 0;

        if (units > 0 && units <= 100) {
            bill = units * 2;
        } else if (units > 101 && units <= 300) {
            bill = units * 5;
        } else if (units > 301) {
            bill = units * 7;
        }
        System.out.println("Total Bill: " + bill);

        sc.close();
    }
}
