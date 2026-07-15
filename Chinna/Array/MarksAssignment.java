package Chinna.Array;

public class MarksAssignment {
    public static void main(String[] args) {
        System.out.println("Students marks list: ");
        int[] marks = { 77, 62, 91, 85, 73, 81, 74, 94, 87, 69 };
        int sum = 0;
        int max = marks[0];
        int min = marks[0];
        for (int mark : marks) {
            if (mark > max) {
                max = mark;
            }
            if (mark < min) {
                min = mark;
            }
            sum += mark;
            System.out.println(mark);
        }
        double average = (double) sum / marks.length;
        System.out.println("Average marks of students: " + average);
        System.out.println("Highest mark is: " + max);
        System.out.println("Lowest mark is: " + min);
    }
}
