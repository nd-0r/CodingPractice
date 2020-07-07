import java.util.*;

/*
    Create a function that determines whether elements in 
    an array can be re-arranged to form a consecutive list 
    of numbers where each number appears exactly once.

if(count == arr1.length) { return true; }
        for(int i = 0; i < arr1.length; i ++) {
            if(arr1[i] == start + 1) {
                find(start + 1, arr1);
            }
        }
        return false;

*/

public class ConsChallenge {

    public static boolean cons(int[] arr) {
        int min = Integer.MAX_VALUE;
        int count = 0;
        boolean found = false;

        for(int i = 0; i < arr.length; i ++) {
            if(arr[i] < min) { min = arr[i]; }
        }
        
        while(count < arr.length - 1) {
            found = false;
            for(int i = 0; i < arr.length; i ++) {
                if(arr[i] == min + 1) {
                    min = min + 1;
                    i = arr.length;
                    found = true;
                }
            }
            if( ! found) { return false; }
            count ++;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] in = {3, 6, 4, 1, 2};
        System.out.println(cons(in));
    }

}
