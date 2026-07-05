package Chinna.Day2;
import java.util.*;
public class StudentResultCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.next();

        System.out.println("Enter Maths marks: ");
        int Maths = sc.nextInt();

        System.out.println("Enter Java marks: ");
        int Java = sc.nextInt();

        System.out.println("Enter AI marks: ");
        int AI = sc.nextInt();

        System.out.println("Enter English marks: ");
        int English = sc.nextInt();

        System.out.println("Enter Python marks: ");
        int Python = sc.nextInt();

        int total = Maths+Java+AI+English+Python;
        System.out.println("Total marks is: "+total);
        System.out.println("Average marks is: "+total/5);

       
        
    }
}
