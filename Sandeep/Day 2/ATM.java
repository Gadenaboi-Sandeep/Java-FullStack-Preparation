import java.util.Scanner;

public class ATM {
    Scanner sc=new Scanner(System.in);
    double balance=10000;


public void checkBalance(){
    System.out.println("Available Balance: "+balance);
    
}

public void deposit(){
    System.out.println("Enter the Deposit Amount:");
    int dAmount=sc.nextInt();
    balance += dAmount;
    System.out.println("Available Balance after deposit: "+balance);
}

public void withdraw(){
    System.out.println("Enter the Withdraw Amount:");
    int wAmount=sc.nextInt();
    if(wAmount>balance){
        System.out.println("Amount Insufficient");
    }
    else{
        balance=balance-wAmount;
        System.out.println("Available Balance after Withdraw: "+balance);
    }
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Main Menu:\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");

        int n=sc.nextInt();

        ATM obj=new ATM();

        switch(n){
            case 1:
                obj.checkBalance();
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
                System.out.println("Transaction Completed...\nThank You...");
        }
      sc.close();
    }
}
