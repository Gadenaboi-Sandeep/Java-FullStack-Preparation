package Sandeep.Arrays;


public class MergeArrays {
    public static void main(String[] args) {
    int[] arr={10,20,30,40,50,60,70,80,90,100};

    int[] arr2={1,2,3,10,20};
    int l1=arr.length;
    int l2=arr2.length;

    int[] arrM=new int[l1+l2];

    for(int i=0;i<l1;i++){
        arrM[i]=arr[i];
    }
    for(int i=0;i<l2;i++){
        arrM[l1+i]=arr2[i];
    }
    System.out.println("The Merged Array is: ");
    for(int i:arrM){
        System.out.print(i+" ");
    }
    }
}
