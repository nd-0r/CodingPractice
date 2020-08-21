import java.util.Arrays;

public class LetterPattern {

    /* 
    Create a function that returns true if two strings share
    the same letter pattern, and false otherwise.
    */

    /* 
    
    sameLetterPattern("ABAB", "CDCD") ➞ true

    sameLetterPattern("ABCBA", "BCDCB") ➞ true

    sameLetterPattern("FFGG", "CDCD") ➞ false

    sameLetterPattern("FFFF", "ABCD") ➞ false

    */

    public static boolean sameLetterPattern(String str1, String str2) {
        
        int[] chars1 = new int[str1.length() - 1];
        int[] chars2 = new int[str2.length() - 1];

        for(int i = 0; i < str1.length() - 1; i ++) {
            chars1[i] = (int) str1.charAt(i + 1) - (int) str1.charAt(i);
        }

        for(int i = 0; i < str2.length() - 1; i ++) {
            chars2[i] = (int) str2.charAt(i + 1) - (int) str2.charAt(i);
        }
        
        System.out.println("chars1: " + Arrays.toString(chars1));
        System.out.println("chars2: " + Arrays.toString(chars2));
        

        if(Arrays.equals(chars1, chars2)) {
            return true;
        }

        return false;

    }

    public static void main(String[] args) {

        System.out.println(sameLetterPattern("ABAB", "CDCD"));
        System.out.println(sameLetterPattern("ABCBA", "BCDCB"));
        System.out.println(sameLetterPattern("FFGG", "CDCD"));
        System.out.println(sameLetterPattern("FFFF", "ABCD"));
        
    }

}