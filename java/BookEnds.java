import java.util.*;

// Use a hash set to store the characters because sets only store unique values

public class BookEnds {
    
    public static int countUniqueBooks(String str, char bookend) {
        
        if(! str.contains(bookend + "")) { return 0; }

        int start; int end;
        HashSet letters = new HashSet();

        while(str.length() > 1 && str.contains(bookend + "")) {
            start = str.indexOf(bookend); 
            end = str.indexOf(bookend, start + 1);
            for(char element: str.substring(start + 1, end).toCharArray()) { 
                letters.add(element);
            }
            str = str.substring(end + 1);
        }

        return letters.size();
        
    }

    public static void main(String[] args) {

        String in = "$ABdkclihsDnfk$KdiwlkdV$lamcopelsD$";
        System.out.println(countUniqueBooks(in, '$'));

    }

}