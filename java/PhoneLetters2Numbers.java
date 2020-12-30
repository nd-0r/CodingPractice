import java.util.*;
import phone.MultiMap;



class TextToNum {

    public static String textToNum(String in) {

        MultiMap mm = new MultiMap(4);

        mm.add(1, "A", 2); mm.add(2, "B", 2); mm.add(3, "C", 2);
        mm.add(1, "D", 2); mm.add(2, "E", 2); mm.add(3, "F", 2);
        mm.add(1, "G", 2); mm.add(2, "H", 2); mm.add(3, "I", 2);
        mm.add(1, "J", 2); mm.add(2, "K", 2); mm.add(3, "L", 2);
        mm.add(1, "M", 2); mm.add(2, "N", 2); mm.add(3, "O", 2);
        mm.add(1, "P", 2); mm.add(2, "Q", 2); mm.add(3, "R", 2); mm.add(4, "S", 2);
        mm.add(1, "T", 2); mm.add(2, "U", 2); mm.add(3, "V", 2);
        mm.add(1, "W", 2); mm.add(2, "X", 2); mm.add(3, "Y", 2); mm.add(4, "Z", 2);

        String out = "";
        for(int i = 0; i < in.length(); i ++) {
            if(Character.isLetter(in.charAt(i))) {
                out += mm.get(in.charAt(i) + "");
            } else {
                out += in.charAt(i) + "";
            }
        }
    }

    public static void main(String[] args) {
        String p1 = "(847) HID-BATS";
        String p2 = "847 271-1251";
        String p3 = "135 A83-UT4D";

        System.out.println(textToNum(p1));
        System.out.println(textToNum(p2));
        System.out.println(textToNum(p3));
    }

}