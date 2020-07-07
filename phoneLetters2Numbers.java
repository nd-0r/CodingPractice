package com.andreworals.phone;
import java.util.*;



class TextToNum {

    public String textToNum(String in) {

        HashMap<String, Integer> letterCorrelations = new HashMap<String, String>();
        letterCorrelations.put("ABC", "2");
        letterCorrelations.put("DEF", "3");
        letterCorrelations.put("GHI", "4");
        letterCorrelations.put("JKL", "5");
        letterCorrelations.put("MNO", "6");
        letterCorrelations.put("PQRS", "7");
        letterCorrelations.put("TUV", "8");
        letterCorrelations.put("WXYZ", "9");

        String out = "";
        for(int i = 0; i < in.length(); i ++) {
            if(Character.isLetter(in.charAt(i))) {
                out += letterCorrelations.get()
            } else {
                out += in.charAt(i) + "";
            }
        }
    }

}
