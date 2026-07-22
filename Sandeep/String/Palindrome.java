public class Palindrome {
 
    static void check(String str) {
        String reverse=new StringBuffer(str).reverse().toString();
        if(str.equalsIgnoreCase(reverse)){
            System.out.println("It is a Palindrome.");
        }
        else{
            System.out.println("It is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        String name = "Sandeep";
        check(name);
    }
}   

