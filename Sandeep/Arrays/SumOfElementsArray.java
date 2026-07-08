package Sandeep.Arrays;

public class SumOfElementsArray{
    public static void main(String[] args) {
        
        int[] arr={10,20,50,14,38,40,60,39,33};

        int sum=0;

        for(int num:arr){
            sum+=num;
        }
        System.out.println("Sum of Elements in Array: "+sum);
    }
}