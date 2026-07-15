package Chinna.Methods;

public class StudentResult {

    // 1. Method to calculate total marks
    public static int calculateTotal(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark; // Adding each subject's mark to the total
        }
        return total;
    }

    // 2. Method to calculate average marks
    public static double calculateAverage(int total, int totalSubjects) {
        return (double) total / totalSubjects; // Type casting to double for precision
    }

    // 3. Method to calculate the grade
    public static String calculateGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 75) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 35) {
            return "D";
        } else {
            return "F (Fail)";
        }
    }

    // 4. Method to display the final result
    public static void displayResult(String name, int[] marks) {
        // Calling the other methods to get the required data
        int total = calculateTotal(marks);
        double average = calculateAverage(total, marks.length);
        String grade = calculateGrade(average);

        // Printing the output
        System.out.println("===============================");
        System.out.println("        STUDENT RESULT         ");
        System.out.println("===============================");
        System.out.println("Name        : " + name);
        System.out.println("Total Marks : " + total + " / " + (marks.length * 100));
        System.out.println("Average     : " + average + "%");
        System.out.println("Grade       : " + grade);
        System.out.println("===============================");
    }

    // Main method to test the code
    public static void main(String[] args) {
        // Sample data to test the methods
        String studentName = "Chinna Reddy"; 
        int[] studentMarks = {88, 92, 75, 84, 96}; // Marks for 5 subjects

        // Call the display method, which will trigger the rest of the logic
        displayResult(studentName, studentMarks);
    }
}