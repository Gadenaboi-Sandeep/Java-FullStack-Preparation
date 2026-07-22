public class Reverse {

    static String rev(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            reverse += ch;
        }

        return reverse;
    }

    public static void main(String[] args) {
        String name = "Sandeep";
        String reve = rev(name);
        System.out.print("The Reversed String is: " + reve);
    }
}