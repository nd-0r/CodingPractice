/*
    Write a function that returns true if it's possible to build a phrase s1 
    using only the characters from another phrase s2.

    Notes:
    - All letters will be in lower case.
    - Numbers and special characters included.
    - Ignore whitespaces.
    - Do not count white space as a character.
*/


public class FridgePoetry {

    public static String removeSpaces(String in) {

        if(! in.contains(" ")) {
            return in;
        }
        
        return removeSpaces(in.substring(0, in.indexOf(" ")) + in.substring(in.indexOf(" ") + 1));

    }

    public static String lexicoSort(String str) {

        char[] in = str.toCharArray();

        char tmp;

        for(int i = 0; i < in.length; i ++) {
            for(int j = i; j > 0; j --) {
                if(in[j - 1] > in[j]) {
                    tmp = in[j - 1];
                    in[j - 1] = in[j];
                    in[j] = tmp;
                } else {
                    break;
                }
            }
        }

        return new String(in);

    }

    public static boolean canBuild(String s1, String s2) {
        
        String s1new = lexicoSort(removeSpaces(s1));
        String s2new = lexicoSort(removeSpaces(s2));

        System.out.println(s1new);
        System.out.println(s2new);

        if(s1new.equals(s2new)) {
            return true;
        }

        return false;

    }

    public static void main(String[] args) {
        System.out.println(canBuild("i am bob", "bobami"));
    }

}