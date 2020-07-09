public class AlmostPalindrome {
    public static boolean almostPalindrome(String str) {

        int badCount = 0;

        for(int i = 0; i < str.length() / 2; i ++) {
            if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
                badCount ++;
            }
        }

        if(badCount != 1) { return false; }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(almostPalindrome("abc3edcba"));
        System.out.println(almostPalindrome("abcdedcba"));
        System.out.println(almostPalindrome("aa"));
        System.out.println(almostPalindrome("b"));
        System.out.println(almostPalindrome(""));

    }
}