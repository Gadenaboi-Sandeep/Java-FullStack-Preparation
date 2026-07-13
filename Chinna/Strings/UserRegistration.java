package Chinna.Strings;

public class UserRegistration {
    public static void main(String[] args) {
        String name = "Chinna";
        String email = "chinna@gmail.com";
        String Password = "12345678";

        if (Password.length() >= 8) {
            System.out.println("Validated");
        }else{
            System.out.println("Enter correct password");
        }
        System.out.println(name.trim());
        System.out.println(email.contains("@"));
        System.out.println(Password);
    }
}
