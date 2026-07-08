package Sandeep.Arrays;

public class EvenOdd {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 37, 47, 50, 60, 77, 80, 90, 100 };

        int even = 0;
        int odd = 0;

        for (int i : arr) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even: " + even + "\nOdd: " + odd);
    }
}
