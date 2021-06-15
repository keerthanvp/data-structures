package strings.words_reverse;

public class WordReverseTest {
    public static void main(String[] args) {
        String str = "Welcome to data structures tutorial";
        System.out.println("Original String:\n"+str);
        reverseWords(str);
        reverseWordsAndString(str);
    }

    public static void reverseWords(String str){
        String[] words = str.split("\\s");
        String reverse = "";

        for (int i = words.length-1; i >= 0; i--) {
            reverse = reverse.concat(words[i])+" ";
        }
        System.out.println("\nReverse words:\n"+reverse);
    }

    public static void reverseWordsAndString(String str){
        String [] words = str.split("\\s");
        String reverseString = "";
        for (int i = words.length-1; i >=0 ; i--) {
            String word = words[i];
            for (int j = word.length()-1; j >=0 ; j--) {
                reverseString = reverseString.concat(String.valueOf(word.charAt(j)));
            }
            reverseString = reverseString.concat(" ");
        }
        System.out.println("\nReverse words and each word:\n"+reverseString);
    }

}
