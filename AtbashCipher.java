import java.text.*;

public class AtbashCipher {

    public static String atbash(String str) {
        
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String alphabetCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String out = "";

        CharacterIterator it = new StringCharacterIterator(str);
        for(char c = it.first(); c != CharacterIterator.DONE; c = it.next()) {
            if(Character.isAlphabetic(c) && Character.isUpperCase(c)) {
                out += alphabetCaps.charAt(25 - alphabetCaps.indexOf(c)) + "";
                continue;
            } else if(Character.isAlphabetic(c) && Character.isLowerCase(c)) {
                out += alphabet.charAt(25 - alphabet.indexOf(c)) + "";
                continue;
            }
            out += c + "";
        }

        return out;

    }
    
    public static void main(String[] args) {
        System.out.println(atbash("apple"));
        System.out.println(atbash("Hello world!"));
        System.out.println(atbash("Christmas is the 25th of December"));
    }

}