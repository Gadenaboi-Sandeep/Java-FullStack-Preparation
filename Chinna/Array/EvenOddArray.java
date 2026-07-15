package Chinna.Array;

public class EvenOddArray {
    public static void main(String[] args) {
        int[] numbers = { 8, 3, 5, 22, 17};
        int count = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                count++;
            }
        }
        System.out.print("Total odd numbers are: "+count);
    }
}
