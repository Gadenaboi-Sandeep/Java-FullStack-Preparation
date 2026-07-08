package Sandeep.Arrays;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        int ele = 88;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                System.out.println("Found Element at: " + (i + 1) + " Position");
            }
            if (i == arr.length-1) {
                System.out.println("Number Not Found!");
            }
        }

    }
}
