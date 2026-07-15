package Chinna.Array;

public class Average {
    public static void main(String[] args) {
        int[] numbers = {18,45,33,96,17};
        int sum = 0;
        for(int number:numbers){
            sum += number;
        }
        double average = (double)sum/numbers.length;
        System.out.println(average);

    }
}