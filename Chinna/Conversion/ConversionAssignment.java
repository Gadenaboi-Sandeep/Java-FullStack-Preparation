package Chinna.Conversion;
import java.util.*;
public class ConversionAssignment {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        
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
        double result = total;
        System.out.println("Total marks is: "+result);
        
        System.out.println("Average marks is: "+result/5);
        int roundedavg = total;
        System.out.println("Rounded average is: "+roundedavg);
        sc.close();
    }
}