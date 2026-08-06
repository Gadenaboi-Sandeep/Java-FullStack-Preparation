public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    void setAccount(String holder, int accNo, double bal){
        this.accountHolder=holder;
        this.accountNumber=accNo;
        this.balance=bal;
    }
    void deposit(double amount){
        balance+=amount;
        //System.out.println(balance);
    }
    void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    void display(){
        System.out.println("Account Holder : "+accountHolder);
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Balance : "+balance);
    }
    public static void main(String[] args) {
        BankAccount acc1=new BankAccount();
        BankAccount acc2=new BankAccount();

        acc1.setAccount("Rahul", 1001, 5000);
        acc2.setAccount("Sandeep", 1002, 10000);

        acc1.deposit(1000);
        acc1.withdraw(1500);
        acc1.display();

        acc2.withdraw(12000);
        acc2.display();
    }
}
