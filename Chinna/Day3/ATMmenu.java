package Chinna.Day3;
import java.util.Scanner;

public class ATMmenu {
    double Balance = 100000;
    Scanner sc = new Scanner(System.in);
    public void balance(){
        System.out.println("Balance amount: "+Balance);
    }
    public void deposit(){
        System.out.println("Enter deposit amount: ");
        double damount = sc.nextDouble();
        Balance += damount;
        System.out.println("Deposited amount: "+Balance);
    }
    public void withdraw(){
        System.out.println("Enter withdraw amount: ");
        double wdamt = sc.nextDouble();
        if(wdamt>Balance){
            System.out.println("Amount Insufficient");
        } else{
            Balance = Balance - wdamt;
            System.out.println("Balance amount is: "+Balance);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Main menu: \n1. Check Balance \n2. Deposit \n3. Withdraw \n4. Exit");
        int n = sc.nextInt();
        ATMmenu obj = new ATMmenu();
        switch(n){
            case 1:
                obj.balance();
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
