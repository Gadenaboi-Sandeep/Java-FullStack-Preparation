public class Palindrome {
    public static void main(String[] args) {
        int n=12321;
        int rev=0;
        int temp=n;

        while(n>0){
            int digit = n % 10;
            rev = rev*10+digit;
            n/=10;
        }
        if(rev==temp){
            System.out.println("It is an Palindrome.");
        }else{
            System.out.println("It is not a Palindrome.");
        }
    }
}
