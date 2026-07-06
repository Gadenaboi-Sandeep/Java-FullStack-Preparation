package Chinna.Day3;

public class EvenOdd {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                System.out.print("Odd Numbers: "+i+" ");
            }
            if(i%2==0){
                System.out.println("Even Numbers: "+i+" ");
            }
        }
    }
}
