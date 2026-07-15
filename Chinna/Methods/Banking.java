package Chinna.Methods;

import java.util.*;

public class Banking {
    double balance = 100000;
    Scanner sc = new Scanner(System.in);

    public void deposit() {
        System.out.println("Available balance is: " + balance);
        System.out.print("Enter the deposit amount: ");
        double damt = sc.nextDouble();
        balance = damt + balance;
        System.out.println("Total amount is: " + balance);
    }

    public void withdraw() {
        System.out.print("Enter the withdraw amount: ");
        double wamt = sc.nextDouble();
        balance = balance - wamt;
        System.out.println("Aailable balance is: " + balance);
    }

    public void checkbalance() {
        System.out.println();
    }

    public static void main(String[] args) {
        Banking bk = new Banking();
        bk.checkbalance();
        bk.deposit();
        bk.withdraw();

    }
}
