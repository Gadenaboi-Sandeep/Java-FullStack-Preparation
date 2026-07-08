package Sandeep.Arrays;

public class Largest {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80,90,100};

        int Largest=arr[0];

        for(int i:arr){
            if(i>Largest)Largest=i;
        }
        System.out.println("The Largest is: "+Largest);
    }
}
