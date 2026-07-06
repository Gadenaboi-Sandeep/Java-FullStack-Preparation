import java.util.ArrayList;

public class EvenOddLoops {
    public static void main(String[] args) {

        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
