import java.util.*;

/*
    Create a function that determines whether elements in 
    an array can be re-arranged to form a consecutive list 
    of numbers where each number appears exactly once.
*/

public static class ConsChallenge {

    private static int count = 1;

    private static boolean find(int start, int[] arr1) {
        if(count == arr1.length) { return true; }
        for(int i = 0; i < arr1.length; i ++) {
            if(arr1[i] == start + 1) {
                count ++;
                find(start + 1, arr1);
            }
        }
        count ++;
        return false;
    }
    public static boolean cons(int[] arr) {
        count = 1;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i ++) {
            if(arr[i] < min) { min = arr[i]; }
        }
        return find(min, arr0);
    }

    public static void main(String[] args) {
        int[] in = {3, 5, 4, 1, 2};
        System.out.println(cons(in));
    }

}