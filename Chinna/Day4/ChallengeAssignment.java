package Chinna.Day4;

public class ChallengeAssignment {
    public static void main(String[] args) {
        int[] marks = {
                        85, 92, 78, 45, 66, 88, 91, 73, 54, 82,
                        77, 64, 95, 89, 71, 59, 84, 90, 76, 68,
                        81, 97, 62, 55, 79, 83, 94, 72, 67, 86,
                        93, 48, 87, 75, 61, 69, 58, 80, 52, 98,
                        49, 63, 74, 96, 70, 85, 91, 78, 56, 88,
                        77, 65, 94, 82, 73, 59, 34, 90, 76, 68,
                        81, 95, 62, 55, 79, 83, 92, 72, 67, 86,
                        93, 47, 87, 75, 60, 69, 58, 80, 53, 97,
                        50, 64, 74, 96, 70, 85, 91, 78, 57, 88,
                        79, 66, 35, 82, 73, 59, 84, 90, 76, 68};
                        int TotalSum = 0;
                        int HighestScore = 0;
                        int LowestScore = 0;
                        int PassStudents = 0;

                        for(int mark:marks){
                            TotalSum += mark;
                        }
                        System.out.println(TotalSum);


    }
}
