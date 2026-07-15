package Chinna.Array;

public class SumofArray {
    public static void main(String[] args) {
        int[] marks = {10,30,20,60,40};
        int sum=0;
        for(int mark:marks){
            sum += mark;
        }
        System.out.println(sum);
    }
}
