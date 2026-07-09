package Sandeep.Arrays;

public class AddMatrix {
    public static void main(String[] args) {

        int[][] arr1 = { { 10, 20 }, { 30, 40 } };

        int[][] arr2 = { { 5, 10 }, { 15, 20 } };

        int[][] sum = new int[arr1.length][arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

    }
}
