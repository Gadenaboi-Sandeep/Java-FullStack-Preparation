public class Prime {
    public static void main(String[] args) {
        int n=21;
        int count=2;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(n+" is a Prime.");
        }
        else{
            System.out.println(n+" is not a Prime.");
        }

    }
}
