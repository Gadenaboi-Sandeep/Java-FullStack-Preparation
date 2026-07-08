package Chinna.Day4;

public class SmallestElement {
    public static void main(String[] args) {
        int[] numbers = {30,66,45,5,20};
        int min = numbers[0];
        for(int number:numbers){
            if(number<min){
                min = number;
            }
        }
        System.out.print("Smallest number is: "+min);
    }
}
