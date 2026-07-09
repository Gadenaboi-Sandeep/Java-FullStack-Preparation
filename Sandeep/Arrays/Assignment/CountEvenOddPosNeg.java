package Sandeep.Arrays.Assignment;

public class CountEvenOddPosNeg {
    public static void main(String[] args) {

        int[] arr = { 10, 15, 12, 40, -25, -35, -5, -2, 45, 86 };
        int len = arr.length;

        int even = 0;
        int odd = 0;
        int pos = 0;
        int neg = 0;

        for (int i = 0; i < len; i++) {
            if (arr[i] > 0)
                pos++;
            if (arr[i] % 2 == 0)
                even++;
            if (arr[i] % 2 != 0)
                odd++;
            if (arr[i] < 0)
                neg++;
        }
        System.out.println("Count:");
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        System.out.println("Positive: " + pos);
        System.out.println("Negative: " + neg);
    }
}
