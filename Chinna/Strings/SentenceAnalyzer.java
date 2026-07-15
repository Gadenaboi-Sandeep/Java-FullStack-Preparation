package Chinna.Strings;

public class SentenceAnalyzer {
    public static void main(String[] args) {
        String sentence = "Java Full Stack with AI";
        String[] words = sentence.split(" ");

        String longest = words[0];
        String shortest = words[0];

        for(int i=0;i<words.length;i++){
            if(words[i].length()>longest.length()){
                longest = words[i];
            }
            if(words[i].length()<shortest.length()){
                shortest = words[i];
            }
        }

        System.out.println("Longest word: "+longest);
        System.out.println("Shortest word: "+shortest);


        System.out.println("Number of words: "+words.length);
    }
}
