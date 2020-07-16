/*
An input string can be completed if additional letters can be added 
and no letters need to be taken away to match the word. Furthermore, 
the order of the letters in the input string must be the same as the 
order of letters in the final word.

Create a function that, given an input string, determines if the 
word can be completed.
*/

public class CompleteTheWord {

    public static boolean canComplete(String initial, String word) {
        int last = -1;
        for(int i = 0; i < initial.length(); i ++) {
            if(! word.contains(initial.charAt(i) + "")) { return false; }
            if(word.indexOf(initial.charAt(i) + "") <= last) { return false; }
            last = word.indexOf(initial.charAt(i) + "");
            System.out.println(last);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canComplete("butl", "beautiful"));
        System.out.println(canComplete("butlz", "beautiful"));
        System.out.println(canComplete("tulb", "beautiful"));
        System.out.println(canComplete("bbutl", "beautiful"));
    }

}