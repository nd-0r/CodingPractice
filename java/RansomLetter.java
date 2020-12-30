public class RansomLetter {

    /* Write a function that returns true if you can use the 
    letters of the first string to create the second string. 
    Letters are case sensitive.
    */

    public static boolean canBuild(String str1, String str2) {
        char[] str2char = str2.toCharArray();
        for(char letter: str2char) {
            if(! str1.contains(letter + "")) {
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args) {
        System.out.println(canBuild("abCD", "aBCD"));
    }

}