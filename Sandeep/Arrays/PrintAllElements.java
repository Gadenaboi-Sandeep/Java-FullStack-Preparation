package Sandeep.Arrays;

public class PrintAllElements {
    public static void main(String[] args) {
        int[] array=new int[5];

        array[0]=10;
        array[1]=20;
        array[2]=30;
        array[3]=40;
        array[4]=50;
        for(int i:array){
            System.out.print(i+" ");
        }

    }
}
