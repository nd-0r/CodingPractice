public class RecursiveStringReverse {

    public static String recursiveReverseString(String toReverse, int count) {
        if (toReverse == null) {
            throw new IllegalArgumentException();
        }
        if (count >= toReverse.length() - 1) {
            return toReverse;
        }
        String temp = toReverse.charAt(toReverse.length() - 1) + toReverse.substring(0, toReverse.length() - 1);
        return recursiveReverseString(temp, count + 1);
    }

    public static void main(String[] unused) {
        String test1 = "asdf";
        String test2 = "";
        assert recursiveReverseString(test1, 0).equals("fdsa");
        assert recursiveReverseString(test2, 0).equals("");
        System.out.println("CORRECT");
    }

}