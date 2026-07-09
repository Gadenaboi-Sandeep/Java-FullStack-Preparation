package Sandeep.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80,90,100};

        int[] cp=new int[arr.length];
        
        for(int i=0;i<cp.length;i++){
            cp[i]=arr[i];
        }
        for(int i:cp){
        System.out.print(i+" ");
        }
    }
}
