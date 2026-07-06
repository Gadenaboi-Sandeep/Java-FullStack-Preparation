public class CountDigits {
    public static void main(String[] args) {
        long n=124533;
        int count=0;
        while(n>0){
            n/=10;
            count++;
        }
        System.out.println("The Number of Digits are: "+count);
    }
}
