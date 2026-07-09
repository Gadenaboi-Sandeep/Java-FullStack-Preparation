package Chinna.Day4;

public class CountAssignment {
    public static void main(String[] args) {
        
        int[] marks = { 77, 62, 91, 85, 73, 81, 74, 94, 87, 69, -22};
        int evecount=0;
        int oddcount=0;
        int pscount=0;
        int ngcount=0;
        for(int mark:marks){
            if(mark%2==0){
                evecount++;
            }else{
                oddcount++;
            }
            if(mark>0){
                pscount++;
            }else{
                ngcount++;
            }
        }
        System.out.println("Even Numbers are: "+evecount);
        System.out.println("Odd Numbers are: "+oddcount);
        System.out.println("Positive numbers are: "+pscount);
        System.out.println("Negative numbers are: "+ngcount);
    }
}
