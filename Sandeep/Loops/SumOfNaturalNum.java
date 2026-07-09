public class SumOfNaturalNum {
    public static void main(String[] args) {
        int n = 20;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of " + n + " Natural Numbers: " + sum);
    }
}
