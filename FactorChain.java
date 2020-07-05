import java.util.*;

/*
    A factor chain is an array where each 
    previous element is a factor of the next 
    consecutive element.
*/

public class FactorChain {

    public static boolean isFactorChain(int[] in) {
        for(int i = 1; i < in.length; i ++) {
            if(in[i] % in[i - 1] != 0) { return false; }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 8, 16, 32};
        int[] arr2 = {2, 4, 6, 7, 12};
        System.out.println(isFactorChain(arr1));
        System.out.println(isFactorChain(arr2));
    }

}