/*
    Write a function that returns the closest palindrome number to an integer. If two 
    palindrome numbers tie in absolute distance, return the smaller number.
*/

public class PalindromeNumber {

    public static boolean isPal(int num) {

        String in = String.valueOf(num);

        for(int i = 0; i < in.length() / 2; i ++) {
            if(in.charAt(i) != in.charAt(in.length() - i - 1)) {
                return false;
            }
        }

        return true;

    }
    
    public static int closestPalindrome(int num) {
        
        int i = 0;
        while(! (isPal(num - i) && isPal(num + i)) ) {
            i ++;
        }

        if(isPal(num - i) && isPal(num + i)) {
            return Math.min(num - i, num + i);
        } else if(isPal(num - i)) {
            return (num - i);
        }
        return (num + i);

    }

    public static void main(String[] args) {

        System.out.println(closestPalindrome(978215236));

    }

}