package Sandeep.String;

public class VowelsConsonants {

    public static void counter(String str){
        int vow=0;
        int con=0;

        for(int i=0;i<str.length();i++){
            char s=str.charAt(i);
            if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'||
                s=='A'||s=='E'||s=='I'||s=='O'||s=='U'){
                    vow++;
                }
            else{
                con++;
            }
        }
        System.out.println("The num of Vowels: "+vow);
        System.out.println("The num of Consonants: "+con);
    }


    public static void main(String[] args) {
        String name="Sandeep";
        counter(name);
    }
}
