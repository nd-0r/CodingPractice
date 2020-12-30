/* 
Write a function which increments a string to create a new string.

If the string ends with a number, the number should be incremented by 1.
If the string doesn't end with a number, 1 should be added to the new string.
*/

import java.text.*;
import java.util.*;

public class StringIncrementer {
    public static String incrementString(String str) {
        
        int i = str.length() - 1;

        while(! Character.isLetter(str.charAt(i))) { i--; }

        String first = str.substring(0, i + 1);
        int second;

        if(i == str.length() - 1) {
            return first + String.valueOf(1);
        } else {
            second = Integer.valueOf(str.substring(i + 1));
            second++;
        }

        char[] temp = new char[str.length() - i - 1];
        Arrays.fill(temp, '0');
        String zeroes = new String(temp);
        DecimalFormat df = new DecimalFormat(zeroes);

        return first + df.format(second);
        
    }

    public static void main(String[] args) {
        System.out.println(incrementString("foo"));
        System.out.println(incrementString("foobar0009"));
        System.out.println(incrementString("foo099"));
    }
}