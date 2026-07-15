package Chinna.Array;

public class AddingArrays {
    public static void main(String[] args) {

        int[][] a = { { 22, 4 },{ 11, 16 } };

        int[][] b = { { 3, 30 },{ 12, 30 } };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] + b[i][j] + " ");
            }
            System.out.println();
        }
    }
}