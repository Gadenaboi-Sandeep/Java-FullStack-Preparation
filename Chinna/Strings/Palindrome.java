package Chinna.Strings;

public class Palindrome {
    public static void main(String[] args) {
        
        String input = "MARKRAM";

        
        String reversed = new StringBuilder(input).reverse().toString();

        if(input.equals(reversed)){
            System.out.println(reversed+" It is a palindrome");
        }else{
            System.out.println(reversed+" It is not a palindrome");
        }
    }
}
