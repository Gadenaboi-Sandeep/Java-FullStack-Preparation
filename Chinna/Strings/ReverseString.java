package Chinna.Strings;

public class ReverseString {
    public static void main(String[] args) {

        String name = "Chinna";
        StringBuilder sb = new StringBuilder();
        for(int i=name.length()-1;i>=0;i--){
            sb.append(name.charAt(i));
        }
        System.out.println("Original string: "+name);
        System.out.println("Reversed string: "+sb);
    }
}

        //StringBuilder sb = new StringBuilder("Chinna");
        //System.out.println(sb.reverse());