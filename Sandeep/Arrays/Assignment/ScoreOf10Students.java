package Sandeep.Arrays.Assignment;

public class ScoreOf10Students {
    public static void main(String[] args) {
        
        int[] marks={80,60,40,80,60,80,90,90,50,70};
        int len=marks.length;

        int sum=0;
        int high=marks[0];
        int lowest=marks[0];

        for(int i=0;i<len;i++){
            sum+=marks[i];
            if(marks[i]>high){
                high=marks[i];
            }
            if(marks[i]<lowest){
                lowest=marks[i];
            }
        }
        int avg=sum/len;
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+avg);
        System.out.println("Topper: "+high);
        System.out.println("Least: "+lowest);
    }
}
