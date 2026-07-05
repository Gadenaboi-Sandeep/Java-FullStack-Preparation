import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.println("Enter the marks in each subject:\nTelugu: ");
        int telugu = sc.nextInt();

        System.out.println("Hindi: ");
        int hindi = sc.nextInt();

        System.out.println("English: ");
        int english = sc.nextInt();

        System.out.println("Maths: ");
        int maths = sc.nextInt();

        System.out.println("Science: ");
        int science = sc.nextInt();

        int total=telugu+hindi+maths+science;
        double totald=total;
        double avg=total/5;
        int rounded=(int) Math.round(avg);

        System.out.println("Name: "+name);
        System.out.println("Total(int): "+total);
        System.out.println("Total(double): "+totald);
        System.out.println("Average: "+avg);
        System.out.println("Rounded Average: "+rounded);
        
        sc.close();
    }
}
