package Chinna.Day3;
import java.util.*;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");

        System.out.print("Enter marks: ");
        int Java = sc.nextInt();
        int marks = Java;
        if(marks>=90){
            System.out.println("Student passed with A Grade");
        } else if(marks>=80){
            System.out.println("Student passed with B Grade");
        } else if(marks>=70){
            System.out.println("Student passed with C Grade");
        } else if(marks>=60){
            System.out.println("Student passed with D Grade");
        } else if(marks<=50){
            System.out.println("Student Failed");
        }
        sc.close();
    }
}
