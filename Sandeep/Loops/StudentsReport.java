import java.util.Scanner;

public class StudentsReport {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.print("Enter 10 Students Marks: ");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }

        int sum=0;
        int fail=0;
        int pass=0;
        int top=0;
        for(int i=0;i<10;i++){
            sum+=arr[i];
            if(arr[i]<35){
                fail++;
            }
            else if(arr[i]>=35){
                pass++;
            }
            if(arr[i]>top){
                top=arr[i];
            }

        }

        System.out.println("Avg Marks: "+(sum/10));
        System.out.println("Pass Count: "+pass);
        System.out.println("Fail Count: "+fail);
        System.out.println("Top Marks: "+top);

        sc.close();
    }
}
