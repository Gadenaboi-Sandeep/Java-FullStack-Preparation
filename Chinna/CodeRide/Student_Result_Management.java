package Chinna.CodeRide;
import java.util.*;

public class Student_Result_Management {
	
	int rollNo;
	String name;
	int total;
	double average; 
	String grade; 
	
	Scanner sc = new Scanner(System.in);
	
	// Constructor
	public Student_Result_Management(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public void addMarks() {
		System.out.println("Enter Java marks: ");
		int javam = sc.nextInt();
		
		System.out.println("Enter Python marks: ");
		int pythonm = sc.nextInt();
		
		System.out.println("Enter AI marks: ");
		int aim = sc.nextInt();
		
		System.out.println("Enter English marks: ");
		int Engm = sc.nextInt();
		
		this.total = javam + pythonm + aim + Engm;
	}
	
	public void calculateAverage() {
		this.average = this.total / 4.0; 
	}
	
	public void calculateGrade() {
		if (average >= 90) {
			grade = "A";
		} else if (average >= 80) {
			grade = "B";
		} else if (average >= 70) {
			grade = "C";
		} else if (average >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
	}
	
	public void displayResult() {
		System.out.println("\n--- Student Result ---");
		System.out.println("Roll No: " + rollNo);
		System.out.println("Name: " + name);
		System.out.println("Total Marks: " + total + "/400");
		System.out.println("Average: " + average + "%");
		System.out.println("Grade: " + grade);
	}
	
	public static void main(String[] args) {
		Student_Result_Management s = new Student_Result_Management(40, "Chinna");
	
		s.addMarks();
		s.calculateAverage();
		s.calculateGrade();
		s.displayResult();
	}
}
