package strings.string_reverse;

public class StringReverseTest {
    public static void main(String[] args) {
        String str = "Hello World";
        char [] reverse = new char[20];
        int strLength = str.length() ;
        for (int i = 0,j= strLength-1; i < str.length(); i++,j--) {
            reverse[i] = str.charAt(j);
        }
        System.out.println(reverse);
    }
}
