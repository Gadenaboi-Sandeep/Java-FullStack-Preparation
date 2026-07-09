public class SumOfDigits {
    public static void main(String[] args) {
        
        int num=1223;
        int sum=0;

        while(num>0){
            int digit=num%10;
                sum=sum+digit;
                num/=10;
        }
        System.out.println("The Sum of Digits is "+sum);
    }
}
