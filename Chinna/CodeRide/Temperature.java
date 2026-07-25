package Chinna.CodeRide;
import java.util.*;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();

        if(temp>100){
            System.out.println("Boiling");
        }else{
            System.out.println("Normal");
        }
    }
}
