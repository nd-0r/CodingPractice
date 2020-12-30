import java.util.*;

/* 
    Create a function that takes two numbers as arguments (num, length) 
    and returns an array of multiples of num up to length.
*/
public class ArrayOfMultiples {

    public static int[] arrayOfMultiples(int num, int length) {
        int[] out = new int[length];
        for(int i = 1; i <= length; i++) {
            out[i - 1] = i * 7;
        }
        return out;
    }

    public static void main(String[] args) {
        for(int element: arrayOfMultiples(7, 5)) {
            System.out.print(element + " | ");
        }
    }

}