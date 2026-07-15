package Chinna.Strings;

public class CountAssignment {
    public static void main(String[] args) {
        String name = "Chinna@1222";
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int specialChar = 0;
        int spaces = 0;
        name = name.toLowerCase();

        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);

            if(ch>='a' && ch<='z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowels++;
                }else{
                    consonants++;
                }
            }
            else if(ch >= '0' && ch <= '9'){
                digits++;
            }
            else if(ch == ' '){
                spaces++;
            }
            else {
                specialChar++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        System.out.println("Special Characters: " + specialChar);
        System.out.println(name.length());
    }
}
