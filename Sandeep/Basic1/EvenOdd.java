package Sandeep.Basic1;

import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number to check Even/Odd:");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println(num+" is Even.");
        }
        else{
            System.out.println(num+" is Odd.");
        }
        sc.close();
    }
}
