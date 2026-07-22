package Sandeep.String;

public class VowelCount {
    
    public static int counter(String str){
        int count=0;
        
        for(int i=0;i<str.length();i++){
            char s=str.charAt(i);

            if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'||
                s=='A'||s=='E'||s=='I'||s=='O'||s=='U'){
                    count++;
                }
        }

        return count;
    }

    public static void main(String[] args) {
        String name="Sandeep";

       int vowels=counter(name);

        System.out.println("The Vowels count : "+vowels);
    }
}
