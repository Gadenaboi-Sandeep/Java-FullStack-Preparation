package Sandeep.Basic;

import java.util.*;

public class MiniProjectStudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.println("Enter the marks in each subject:\nTelugu: ");
        int telugu = sc.nextInt();

        System.out.println("Hindi: ");
        int hindi = sc.nextInt();

        System.out.println("English: ");
        int english = sc.nextInt();

        System.out.println("Maths: ");
        int maths = sc.nextInt();

        System.out.println("Science: ");
        int science = sc.nextInt();

        int total=(telugu+hindi+english+maths+science);
        double avg=(total/5);
        
        System.out.println(name);
        

        if(telugu<35 || hindi<35 ||english<35 || maths<35||science<35){
            System.out.println("F -> Student Failed!");
        }
        else if(avg>=35 && avg<=59){
            System.out.println("Passed with grade -> D");
        }
        else if(avg>=60 && avg<=74){
            System.out.println("Passed with grade -> C");
        }
        else if(avg>=75 && avg<=89){
            System.out.println("Passed with grade -> B");
        }
        else if(avg>=90 && avg<=100){
            System.out.println("Passed with grade -> A");
        }
        
        System.out.println("The Total Marks: "+total);
        sc.close();
    }
}
