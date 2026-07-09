package Sandeep.Basic;
import java.util.Scanner;

public class LargestOf3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Numbers with spaces: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int largest=a;

        if (a > b && a > c) {
            largest=a;
        } else if (b > a && b > c) {
            largest=b;
        } else {
            largest=c;
        }

        System.out.println(largest+" is the Greater Number.");
        sc.close();
    }
}
