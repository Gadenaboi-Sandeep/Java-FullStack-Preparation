package Chinna.Day3;
import java.util.*;

public class ElectricityBill {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter electricity units: ");
        int bill = sc.nextInt();
        int ebill = 0;

        if(bill>0 && bill<=100){
            ebill = bill*2;

        } else if(bill>101 && bill<=300){
            ebill = bill*5;
            
        } else if(bill>301){
            ebill = bill*8;
        }
        System.out.println("Electricity bill is: "+ebill);

        sc.close();
    }
}
