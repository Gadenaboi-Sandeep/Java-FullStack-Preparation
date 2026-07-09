package Sandeep.Basic;

import java.util.*;

public class Vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name=sc.nextLine();
        System.out.println("Enter Your Age: ");
        int age=sc.nextInt();

        if(age<18){
            System.out.println("Oops! "+name+" is not eligibile to vote.");
        }
        else if(age>=18){
            System.out.println("Great, "+name+" is eligibile to vote.");
        }
        sc.close();
    }
}
