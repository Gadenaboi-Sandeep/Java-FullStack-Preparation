package Chinna.HomeWork_Programs;

public class SpyNum {
    public static void main(String[] args) {
		int num = 123;
		int sum = 0;
		int prod = 1;
		
		while(num>0) {
			int rem = num % 10;
			sum = sum + rem;
			prod = prod * rem;
			num = num/10;
		}
		if(sum==prod) {
			System.out.println("Spy number");
		}else {
			System.out.println("It is not spy number");
		}
	}
}
