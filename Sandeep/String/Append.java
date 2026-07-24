public class Append {
    public static void main(String[] args) {
        String ori="madam";
        String sb=new StringBuilder(ori).reverse().toString();

        
        System.out.println(ori.equals(sb))  ;
    }
}
