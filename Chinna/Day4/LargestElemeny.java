package Chinna.Day4;

public class LargestElemeny {
    public static void main(String[] args) {
        int[] numbers = {40,60,20,5,30};
        int max = numbers[0];
        for(int number : numbers){
            if(number > max){
                max=number;
            }
        }
        System.out.print("Largest Number is: "+max);
    }
}
