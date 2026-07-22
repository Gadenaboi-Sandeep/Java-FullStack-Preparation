package Sandeep.String;

public class SpaceCount {

    static int Count(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char s=str.charAt(i);

            if(s==' '){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String sen="My name is Sandeep Gadenaboi.";
        int spaces=Count(sen);
        System.out.println("Number of spaces: "+spaces);
    }
}
