/* 

Create a function that takes a number as an argument and returns true 
if the number is a valid credit card number, false otherwise.

Credit card numbers must be between 14-19 digits in length, and pass 
the Luhn test, described below:

    - Remove the last digit (this is the "check digit").
    - Reverse the number.
    - Double the value of each digit in odd-numbered positions. 
        If the doubled value has more than 1 digit, add the digits 
        together (e.g. 8 x 2 = 16 ➞ 1 + 6 = 7).
    - Add all digits.
    - Subtract the last digit of the sum (from step 4) from 10. The 
        result should be equal to the check digit from step 1.

*/

import java.util.*;

public class VerifyCreditCard {

    public static int[] toIntArr(long in) {
        Stack<Integer> hold = new Stack<Integer>();
        int count = 0;
        while(in > 0) {
            hold.push(new Integer(Integer.valueOf(Long.toString(in % 10))));
            in /= 10;
            count++;
        }
        int[] out = new int[count];
        for(int i = 0; i < count; i ++) {
            out[i] = hold.pop();
        }
        return out;
    }

    public static int[] reverse(int[] in) {
        int hold;
        for(int i = 0; i < in.length / 2; i ++) {
            hold = in[i];
            in[i] = in[in.length - i - 1];
            in[in.length - i - 1] = hold;
        }
        return in;
    }

    public static boolean validateCard(long num) {
        
        int check = num % 10;

        System.out.println(num);
        int[] card = toIntArr(num);
        System.out.println(Arrays.toString(card));

        if(card.length < 14 || card.length > 19) {
            return false;
        }

        card = reverse(card);
        System.out.println(Arrays.toString(card));

        for(int i = 1; i < card.length; i += 2) {
            card[i] *= 2;
            if(card[i] >= 10) {
                card[i] = (card[i] % 10) + (card[i] / 10);
            }
        }

        System.out.println(Arrays.toString(card));

        int sum = 0;

        for(int number: card) {
            sum += number;
        }

        System.out.println(sum);

        if(10 - (sum % 10) != check) {
            return false;
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(validateCard(1234567890123456L));
    }

}