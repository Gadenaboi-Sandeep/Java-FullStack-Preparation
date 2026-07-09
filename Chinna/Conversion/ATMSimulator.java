package Chinna.Conversion;

import java.util.Scanner;

public class ATMSimulator {
    double balance = 100000;
    Scanner sc = new Scanner(System.in);

    public void checkbalance() {
        System.out.println("Available Balance is: " + balance);
    }

    public void deposit() {
        System.out.println("Enter the deposit ammount: ");
        int damount = sc.nextInt();
        balance = balance + damount;
        System.out.println("Deposited amount: " + balance);
    }

    public void withdraw() {
        System.out.println("Enter the withdraw amount: ");
        int withdrawamt = sc.nextInt();
        if (withdrawamt > balance) {
            System.out.println("Amount Insufficient");
        } else {
            balance = balance - withdrawamt;
            System.out.println("Withdraw amount: " + balance);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Main menu: \n1. Check Balance \n2. Deposit \n3. Withdraw \n4. Exit");
        int n = sc.nextInt();
        ATMSimulator obj = new ATMSimulator();
        switch (n) {
            case 1:
                obj.checkbalance();
                break;
            case 2:
                obj.deposit();
                break;
            case 3:
                obj.withdraw();
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid Input");
        }
        sc.close();
    }
}
