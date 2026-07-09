package Sandeep.Basic;

import java.util.Scanner;

public class PoNeZe{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number: ");
    int num=sc.nextInt();

    if(num==0){
        System.out.println("Oops! It's a Zero.");
    }
    else if(num>0){
        System.out.println(num+" is a Positive Number.");
    }
    else{
        System.out.println(num+" is a Negative Number.");
    }

    sc.close();
    }
}