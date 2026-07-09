package Chinna.Day4;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] numbers = {
            { 25, 39 },
            { 12, 22, 40 },
            { 33 }
        };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]);
                if (j < numbers[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
