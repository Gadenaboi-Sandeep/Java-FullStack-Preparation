package Chinna.CodeRide;
import java.util.*;
public class Bank_Management_System {
	int AccNum;
	String AccHolder;
	double balance;
	int withdraw;
	int deposit;
	
	Scanner sc = new Scanner(System.in);
	
	public void checkBalance() {
        System.out.println();
		System.out.println("Available amount: "+balance);
	}
	
	public void deposit() {
		System.out.println("Enter the deposit amount: ");
		double deposit = sc.nextDouble();
		deposit += balance;
		System.out.println("Deposited amount: "+deposit);
	}
	
	public void withdraw() {
		System.out.println("Enter the withdraw amount: ");
		double withdraw = sc.nextDouble();
		balance = balance - withdraw;
		System.out.println("Withdrawed amount: "+withdraw);
	}
	
	public void totalBalance() {
		System.out.println("Total available balance: "+balance);
	}
	
	public Bank_Management_System(int AccNum, String AccHolder, double balance) {
		
		this.AccNum=AccNum;
		this.AccHolder=AccHolder;
		this.balance=balance;
		
		System.out.println("Account Number: "+AccNum);
		System.out.println("Account Holder: "+AccHolder);
		System.out.println("Account Balance: "+balance);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank_Management_System b = new Bank_Management_System(40,"Chinna", 100000.12);
		b.checkBalance();
		b.deposit();
		b.withdraw();
		b.totalBalance();
	}

}
