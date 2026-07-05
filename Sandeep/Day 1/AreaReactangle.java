import java.util.*;

public class AreaReactangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length: ");
        int len=sc.nextInt();
        System.out.println("Enter Breath: ");
        int bre=sc.nextInt();

        int area=len*bre;

        System.out.println("Area Of Rectangle:"+area);
        sc.close();
    }
}
