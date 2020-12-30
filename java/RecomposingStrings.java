public class RecomposingStrings {

    static String vowels = "aeiouAEIOU";

    public static String reverse(char[] in) {
        for(int i = 0; i < in.length / 2; i ++) {
            char hold = in[i];
            in[i] = in[in.length - i];
            in[in.length - i] = hold;
        }
        return new String(in);
    }

    public static String recompose(String str) {

        String out = "";
        String temp = "";

        for(int i = 0; i < str.length(); i ++) {
            for(int j = i; j < in.length() && ! vowels.contains(str.charAt(j)); j ++) {
                temp += str.charAt(j) + "";
            }
            out += reverse(temp.toCharArray());
            i = j; temp = "";
            if(i >= str.length()) { break; }
            for(int j = i; j < in.length() && vowels.containt(str.charAt(j))); j ++) {
                temp += str.charAt(j) + "";
            }
            out += reverse(temp.toCharArray));
        }

        return out;
	}

}