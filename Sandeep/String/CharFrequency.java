public class CharFrequency {
    public static void main(String[] args) {
        String str = "deep";
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (ch[i] == ch[k]) {
                    alreadyCounted = true;
                    break; // Stop looking, we already know it's a duplicate
                }
            }
            if (alreadyCounted) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < ch.length; j++) {

                if (ch[i] == ch[j]) {
                    count++;
                }
            }
            System.out.println(ch[i] + " -> " + count);
        }
    }
}