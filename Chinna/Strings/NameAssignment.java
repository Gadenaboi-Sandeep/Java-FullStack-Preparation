package Chinna.Strings;

public class NameAssignment {
    public static void main(String[] args) {
        String name = "Chinna";
        System.out.println("Name: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("UpperCase: " + name.toUpperCase());
        System.out.println("LowerCase" + name.toLowerCase());
        System.out.println("First Index: " + name.charAt(0));
        System.out.println("Last Index: " + name.charAt(5));

        StringBuilder sc = new StringBuilder("Reddy");
		System.out.println("Reversed name: "+sc.reverse());
    }

}
