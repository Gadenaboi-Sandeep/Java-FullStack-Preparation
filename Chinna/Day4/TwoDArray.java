package Chinna.Day4;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] numbers = { { 25, 39, 52 }, { 12, 22, 40 }, { 33, 72, 69 } };
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
