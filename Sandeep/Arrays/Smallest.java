package Sandeep.Arrays;

public class Smallest {
    public static void main(String[] args) {

        int[] arr = { 20, 20, 30, 40, 50, 10, 70, 80, 90, 100 };

        int Smallest = arr[0];

        for (int i : arr) {
            if (i < Smallest)
                Smallest = i;
        }
        System.out.println("The Smallest is: " + Smallest);
    }
}
