/*
Somehow my strings have all become mixed up; every pair of 
characters has been swapped. Help me undo this so I can 
understand my strings again. The length of a string can 
be odd — in this case the last character is not altered 
(as there's nothing to swap it with).
*/

public class UnmixStrings {

    public static String unmix(String str) {
        String out = "";
        for(int i = 0; i < str.length() - 1; i += 2) {
            out += str.substring(i + 1, i + 2);
            out += str.substring(i, i + 1);
        }
        if(str.length() % 2 == 1) {
            out += str.substring(str.length() - 1);
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(unmix("hTsii  s aimex dpus rtni.g"));
        System.out.println(unmix("123456"));
        System.out.println(unmix("badce"));
    }

}